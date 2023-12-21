package com.study.dcinside.user.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SignUpRequestDto {

    private String username;
    private String nickname;
    private String password;
    private String checkPassword;
    private String email;

    @Builder
    public SignUpRequestDto(final String username, final String nickname, final String password,
        final String checkPassword, final String email) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.checkPassword = checkPassword;
        this.email = email;
    }
}
