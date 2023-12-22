package com.study.dcinside.post.dto.response;

import com.study.dcinside.comment.dto.respons.CommentWithUserResponseDTO;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostWithoutCommentResponseDto {
    private Long id;
    private String title;
    private String username;
    private Long likes;
    private List<CommentWithUserResponseDTO> comments;
}
