package com.study.dcinside.user.controller;

import com.study.dcinside.global.security.userdetails.UserDetailsImpl;
import com.study.dcinside.user.dto.request.UsernameRequestDto;
import com.study.dcinside.user.dto.request.PasswordRequestDto;
import com.study.dcinside.user.dto.request.SignUpRequestDto;
import com.study.dcinside.user.dto.request.UserWithdrawRequestDto;
import com.study.dcinside.user.dto.response.UsernameResponseDto;
import com.study.dcinside.user.dto.response.SignUpResponseDto;
import com.study.dcinside.user.dto.response.UserResponseDto;
import com.study.dcinside.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<SignUpResponseDto> signUp(
        @RequestBody SignUpRequestDto signUpRequestDto) {
        SignUpResponseDto signUpResponseDto = userService.signUp(signUpRequestDto);
        return ResponseEntity.ok(signUpResponseDto);
    }

    @GetMapping
    public ResponseEntity<UserResponseDto> myPage(
        @AuthenticationPrincipal UserDetailsImpl userDetailsImpl
    ) {
        UserResponseDto responseDto = userService.getUserData(userDetailsImpl.getUser());
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping
    public ResponseEntity<String> withdraw(
        @RequestBody UserWithdrawRequestDto userWithdrawRequestDto,
        @AuthenticationPrincipal UserDetailsImpl userDetails
    ) {
        userService.withdraw(userWithdrawRequestDto, userDetails.getUser());
        return ResponseEntity.ok("OK");
    }
}
