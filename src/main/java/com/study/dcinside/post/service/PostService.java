package com.study.dcinside.post.service;

import com.study.dcinside.post.dto.request.PostRequestDto;
import com.study.dcinside.post.dto.response.PostWithCommentResponseDto;
import com.study.dcinside.post.dto.response.PostResponseDto;
import com.study.dcinside.user.entity.User;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

public interface PostService {
    PostResponseDto createPost(PostRequestDto postRequestDto, User user);

    PostResponseDto updatePost(Long post, PostRequestDto postRequestDto, User user);

    PostResponseDto deletePost(Long postId, User user);

    PostWithCommentResponseDto getPost(Long postId);

    @Transactional(readOnly = true)
    List<PostWithCommentResponseDto> getPosts(String type);

    @Transactional(readOnly = true)
    List<PostWithCommentResponseDto> getPostsAuth(String type, User user);
}
