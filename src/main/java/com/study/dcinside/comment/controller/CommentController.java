package com.study.dcinside.comment.controller;

import com.study.dcinside.comment.dto.request.CommentRequestDto;
import com.study.dcinside.comment.dto.respons.CommentResponseDto;
import com.study.dcinside.comment.service.CommentService;
import com.study.dcinside.global.security.userdetails.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/{postId}")
    public CommentResponseDto createComment(@RequestBody CommentRequestDto commentRequestDto,
                                            @AuthenticationPrincipal UserDetailsImpl userDetails,
                                            @PathVariable Long postId) {
        return commentService.createComment(commentRequestDto, userDetails.getUser(), postId);
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<CommentResponseDto> modifyComment(@RequestBody CommentRequestDto commentRequestDto,
                                                            @AuthenticationPrincipal UserDetailsImpl userDetails,
                                                            @PathVariable Long commentId) {
        CommentResponseDto commentResponseDto = commentService.modifyComment(commentRequestDto, userDetails.getUser(), commentId);
        return ResponseEntity.ok(commentResponseDto);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<CommentResponseDto> deleteComment(
            @AuthenticationPrincipal UserDetailsImpl userDetails, @PathVariable Long commentId) {
        CommentResponseDto commentResponseDTO = commentService.deleteComment(userDetails.getUser(),
                commentId);
        return ResponseEntity.ok(commentResponseDTO);
    }
}
