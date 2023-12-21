package com.study.dcinside.user.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SignUpResponseDto {

    private Long id;
    private String username;
    private String password;
    private String email;

    @Builder
    public SignUpResponseDto(final Long id, final String username, final String password, final String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

}
