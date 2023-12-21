package com.study.dcinside.post.dto.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PostRequestDto {
    private String title;
    private String content;
    private String attachment;
}
