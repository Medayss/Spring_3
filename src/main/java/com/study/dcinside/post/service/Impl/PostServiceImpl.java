package com.study.dcinside.post.service.Impl;

import com.study.dcinside.post.dto.request.PostRequestDto;
import com.study.dcinside.post.dto.response.PostWithCommentResponseDto;
import com.study.dcinside.post.dto.response.PostResponseDto;
import com.study.dcinside.post.entity.Post;
import com.study.dcinside.post.exception.IllegalBoardTypeException;
import com.study.dcinside.post.exception.NotFoundPostException;
import com.study.dcinside.post.exception.NotMatchUserException;
import com.study.dcinside.post.repository.PostRepository;
import com.study.dcinside.post.service.PostService;
import com.study.dcinside.postlike.repository.PostLikeRepository;
import com.study.dcinside.user.entity.User;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final PostLikeRepository postLikeRepository;

    @Override
    public PostResponseDto createPost(PostRequestDto postRequestDto, User user) {
        Post post = Post.builder()
            .title(postRequestDto.getTitle())
            .content(postRequestDto.getContent())
            .user(user)
            .build();

        post = postRepository.save(post);

        return new PostResponseDto(post);
    }

    @Transactional
    @Override
    public PostResponseDto updatePost(Long postId, PostRequestDto postRequestDto, User user) {
        Post post = postRepository.findById(postId).orElseThrow(NotFoundPostException::new);

        if (!user.getId().equals(post.getUser().getId())) {
            throw new NotMatchUserException();
        }
        post.updatd(postRequestDto);

        return new PostResponseDto(post);
    }

    @Override
    public PostResponseDto deletePost(Long postId, User user) {
        Post post = postRepository.findById(postId).orElseThrow(NotFoundPostException::new);

        if (!user.getId().equals(post.getUser().getId())) {
            throw new NotMatchUserException();
        }
        postRepository.delete(post);

        return new PostResponseDto(post);
    }

    @Transactional(readOnly = true)
    @Override
    public PostWithCommentResponseDto getPost(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(NotFoundPostException::new);

        return PostWithCommentResponseDto.builder()
            .id(post.getId())
            .title(post.getTitle())
            .content(post.getContent())
            .likes(postLikeRepository.countByPost(post))
            .build();
    }

    @Transactional(readOnly = true)
    @Override
    public List<PostWithCommentResponseDto> getPosts(String type) {
        List<Post> postList;

        if (type.equals("all")) {
            postList = postRepository.findAll();
        } else if (type.equals("recent")) {
            postList = postRepository.findAllByOrderByCreateAtDesc();
        } else {
            throw new IllegalBoardTypeException();
        }

        return createBoardWithoutCommentResponseDto(postList);
    }

    @Transactional(readOnly = true)
    @Override
    public List<PostWithCommentResponseDto> getPostsAuth(String type, User user) {
        List<Post> postList = null;

        if (type.equals("all")) {
            return getPosts("all");
        } else if (type.equals("recent")) {
            return getPosts("recent");
        }

        return createBoardWithoutCommentResponseDto(postList);
    }

    private List<PostWithCommentResponseDto> createBoardWithoutCommentResponseDto(List<Post> posts) {
        List<PostWithCommentResponseDto> postWithCommentResponseDtoList = new ArrayList<>();
        for (Post post : posts) {
            postWithCommentResponseDtoList
                .add(PostWithCommentResponseDto.builder()
                    .id(post.getId())
                    .title(post.getTitle())
                    .username(post.getUser().getUsername())
                    .likes(postLikeRepository.countByPost(post))
                    .build());
        }
        return postWithCommentResponseDtoList;
    }
}
