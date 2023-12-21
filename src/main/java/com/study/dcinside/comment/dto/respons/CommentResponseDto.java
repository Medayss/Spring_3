package com.study.dcinside.comment.dto.respons;

import com.study.dcinside.comment.entity.Comment;
import lombok.Getter;

@Getter
public class CommentResponseDto {
    private final Long id;
    private final String content;

    public CommentResponseDto(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
    }
}
