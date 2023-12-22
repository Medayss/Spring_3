package com.study.dcinside.post.dto.response;

import com.study.dcinside.comment.dto.respons.CommentWithUserResponseDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostWithCommentResponseDto {
    private Long id;
    private String title;
    private Long likes;
    private String content;
    private String username;
    private String attachment;
    private List<CommentWithUserResponseDTO> comment;
}
