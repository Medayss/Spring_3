package com.study.dcinside.post.dto.request;

import com.study.dcinside.comment.dto.respons.CommentWithUserResponseDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostWithCommentResponseDto {
    private Long id;
    private String title;
    private String content;
    private String nickname;
    private String attachment;
    private List<CommentWithUserResponseDTO> comment;
}
