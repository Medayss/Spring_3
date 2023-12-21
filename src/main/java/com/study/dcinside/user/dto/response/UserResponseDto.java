package com.study.dcinside.user.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserResponseDto {

    private String username;
    private String imagePath;

    @Builder
    public UserResponseDto(final String username, final String imagePath) {
        this.username = username;
        this.imagePath = imagePath;
    }
}
