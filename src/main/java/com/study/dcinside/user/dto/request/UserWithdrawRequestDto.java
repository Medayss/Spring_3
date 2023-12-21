package com.study.dcinside.user.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserWithdrawRequestDto {

    private String password;
    private String confirmationPhrase;
}
