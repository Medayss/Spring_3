package com.study.dcinside.post.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardWithoutCommentResponseDto {
    private Long id;
    private String title;
    private String nickname;
}
