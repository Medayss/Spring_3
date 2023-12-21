package com.study.dcinside.postlike.service.Impl;

import com.study.dcinside.post.entity.Post;
import com.study.dcinside.post.exception.NotFoundPostException;
import com.study.dcinside.post.repository.PostRepository;
import com.study.dcinside.postlike.entity.PostLike;
import com.study.dcinside.postlike.exception.AlreadyExistPostLikeException;
import com.study.dcinside.postlike.exception.NotFoundPostLikeException;
import com.study.dcinside.postlike.repository.PostLikeRepository;
import com.study.dcinside.postlike.service.PostLikeService;
import com.study.dcinside.user.entity.User;
import com.study.dcinside.user.exception.NotFoundUserException;
import com.study.dcinside.user.repository.UserRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostLikeServiceImpl implements PostLikeService {

    private final PostRepository postRepository;
    private final PostLikeRepository postLikeRepository;
    private final UserRepository userRepository;

    @Override
    public void likePost(final Long postId, final User user) {
        User loginUser = userRepository.findById(user.getId()).orElseThrow(NotFoundUserException::new);

        Optional<PostLike> findPostLike = postLikeRepository.findByUserAndPostId(loginUser, postId);
        if (findPostLike.isPresent()) {
            throw new AlreadyExistPostLikeException();
        }

        Post post = postRepository.findById(postId).orElseThrow(NotFoundPostException::new);

        PostLike postLike = PostLike.builder()
            .post(post)
            .user(loginUser)
            .build();

        postLikeRepository.save(postLike);
    }

    @Override
    public void unlikePost(final Long postId, final User user) {
        User loginUser = userRepository.findById(user.getId()).orElseThrow(NotFoundPostException::new);

        Optional<PostLike> findPostLike = postLikeRepository.findByUserAndPostId(loginUser, postId);
        if (findPostLike.isPresent()) {
            throw new NotFoundPostLikeException();
        }

        PostLike postLike = findPostLike.get();
        postLikeRepository.delete(postLike);
    }

}
