package com.study.dcinside.user.service.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.study.dcinside.user.entity.User;
import com.study.dcinside.user.exception.FailDeleteImageException;
import com.study.dcinside.user.exception.FailUploadImageException;
import com.study.dcinside.user.exception.NoImageTypeException;
import com.study.dcinside.user.exception.NotFoundUserException;
import com.study.dcinside.user.repository.UserRepository;
import com.study.dcinside.user.service.UserImageService;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserImageServiceImpl implements UserImageService {

    private final AmazonS3 amazonS3;
    private final UserRepository userRepository;

    @Value("${cloud.aws.s3.bucket}")
    private String bucketName;

    private final static String IMAGE_JPG = "image/jpeg";
    private final static String IMAGE_PNG = "image/png";

    @Override
    @Transactional
    public void uploadImage(final MultipartFile multipartFile, final User user) {
        User findUser = userRepository.findById(user.getId())
            .orElseThrow(NotFoundUserException::new);

        if (!isImageType(multipartFile)) {
            throw new NoImageTypeException();
        }

        String fileName = findUser.getUsername() + "_" + UUID.randomUUID();

        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(multipartFile.getSize());
        metadata.setContentType(multipartFile.getContentType());

        try {
            if (user.getImageName() != null) {
                if (amazonS3.doesObjectExist(bucketName, user.getImageName())) {
                    deleteImage(bucketName, user.getImageName());
                }
            }
            amazonS3.putObject(bucketName, fileName, multipartFile.getInputStream(), metadata);
        } catch (IOException e) {
            throw new FailUploadImageException();
        }

        findUser.uploadImage(fileName, amazonS3.getUrl(bucketName, fileName).toString());
    }

    private void deleteImage(String bucketName, String imageName) {
        try {
            amazonS3.deleteObject(bucketName, imageName);
        } catch (Exception e) {
            throw new FailDeleteImageException();
        }
    }

    @Override
    @Transactional
    public void deleteImage(final User user) {
        User findUser = userRepository.findById(user.getId()).orElseThrow(NotFoundUserException::new);

        if (user.getImageName() == null) {
            return;
        }

        if (!amazonS3.doesObjectExist(bucketName, user.getImageName()));
        findUser.deleteImage();
    }

    private boolean isImageType(MultipartFile multipartFile) {
        return Objects.equals(multipartFile.getContentType(), IMAGE_JPG)
            || Objects.equals(multipartFile.getContentType(), IMAGE_PNG);
    }
}
