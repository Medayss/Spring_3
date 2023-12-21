package com.study.dcinside.comment.dto.respons;

import com.study.dcinside.comment.entity.Comment;
import lombok.Getter;

@Getter
public class CommentWithUserResponseDTO {

    private final Long id;
    private final String nickname;
    private final String content;

    public CommentWithUserResponseDTO(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.nickname = comment.getUser() == null ? "탈퇴한 사용자" : comment.getUser().getUsername();
    }
}
