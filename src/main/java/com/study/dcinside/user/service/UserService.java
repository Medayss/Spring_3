package com.study.dcinside.user.service;

import com.study.dcinside.user.dto.request.UsernameRequestDto;
import com.study.dcinside.user.dto.request.PasswordRequestDto;
import com.study.dcinside.user.dto.request.SignUpRequestDto;
import com.study.dcinside.user.dto.request.UserWithdrawRequestDto;
import com.study.dcinside.user.dto.response.UsernameResponseDto;
import com.study.dcinside.user.dto.response.SignUpResponseDto;
import com.study.dcinside.user.dto.response.UserResponseDto;
import com.study.dcinside.user.entity.User;

public interface UserService {
    SignUpResponseDto signUp(SignUpRequestDto requestDto);
    UserResponseDto getUserData(User user);

    void withdraw(UserWithdrawRequestDto userWithdrawRequestDto, User user);
}
