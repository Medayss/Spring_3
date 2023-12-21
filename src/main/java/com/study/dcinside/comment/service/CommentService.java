package com.study.dcinside.comment.service;

import com.study.dcinside.comment.dto.request.CommentRequestDto;
import com.study.dcinside.comment.dto.respons.CommentResponseDto;
import com.study.dcinside.user.entity.User;

public interface CommentService {
    CommentResponseDto createComment(CommentRequestDto commentRequestDTO, User user, Long boardId);

    CommentResponseDto modifyComment(CommentRequestDto commentRequestDTO, User user,
                                     Long commentId);

    CommentResponseDto deleteComment(User user, Long commentId);
}
