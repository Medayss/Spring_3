package com.study.dcinside.post.controller;

import com.study.dcinside.post.dto.request.PostRequestDto;
import com.study.dcinside.post.dto.request.PostWithCommentResponseDto;
import com.study.dcinside.post.dto.response.PostResponseDto;
import com.study.dcinside.post.service.PostService;
import com.study.dcinside.global.security.userdetails.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/write")
    public PostResponseDto postWrite(@RequestBody PostRequestDto postRequestDto,
                                     @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return postService.createPost(postRequestDto, userDetails.getUser());
    }

    @PutMapping("/{postId}")
    public ResponseEntity<PostResponseDto> updatePost(@PathVariable Long postId,
                                                      @RequestBody PostRequestDto postRequestDto,
                                                      @AuthenticationPrincipal UserDetailsImpl userDetails) {
        PostResponseDto postResponseDto = postService.updatePost(postId, postRequestDto, userDetails.getUser());
        return ResponseEntity.ok(postResponseDto);
    }

    @DeleteMapping("/{postid}")
    public ResponseEntity<PostResponseDto> deletePost(@PathVariable Long postid,
                                                      @AuthenticationPrincipal UserDetailsImpl userDetails) {
        PostResponseDto postResponseDto = postService.deletePost(postid, userDetails.getUser());
        return ResponseEntity.ok(postResponseDto);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<PostWithCommentResponseDto> getPost(@PathVariable Long postId) {
        PostWithCommentResponseDto postWithCommentResponseDto = postService.getPost(postId);
        return ResponseEntity.ok(postWithCommentResponseDto);
    }


}
