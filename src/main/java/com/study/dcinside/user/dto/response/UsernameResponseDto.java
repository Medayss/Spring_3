package com.study.dcinside.user.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UsernameResponseDto {

    private String username;
    private String nickname;
}
