package com.study.dcinside.postlike.controller;

import com.study.dcinside.global.security.userdetails.UserDetailsImpl;
import com.study.dcinside.postlike.service.PostLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class PostLikeController {
    private final PostLikeService postLikeService;

    @PostMapping("/post/{postId}/like")
    public ResponseEntity<String> likePost (@PathVariable("postId") Long postId,
                                            @AuthenticationPrincipal UserDetailsImpl userDetails) {
        postLikeService.likePost(postId, userDetails.getUser());
        return ResponseEntity.ok("OK");
    }

    @DeleteMapping("/post/{postId}/like")
    public ResponseEntity<String> unlikeBoard(
        @PathVariable("postId") Long postId,
        @AuthenticationPrincipal UserDetailsImpl userDetails
    ) {
        postLikeService.unlikePost(postId, userDetails.getUser());
        return ResponseEntity.ok("OK");
    }
}
