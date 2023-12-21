package com.study.dcinside.user.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PasswordRequestDto {

    private String currentPassword;
    private String newPassword;
    private String checkNewPassword;
}
