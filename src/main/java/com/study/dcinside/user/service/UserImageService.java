package com.study.dcinside.user.service;

import com.study.dcinside.user.entity.User;
import org.springframework.web.multipart.MultipartFile;

public interface UserImageService {
    void uploadImage(MultipartFile multipartFilem, User user);
    void deleteImage(User user);

}
