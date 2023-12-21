package com.study.dcinside.user.service.impl;

import com.study.dcinside.user.dto.request.SignUpRequestDto;
import com.study.dcinside.user.dto.request.UserWithdrawRequestDto;
import com.study.dcinside.user.dto.response.SignUpResponseDto;
import com.study.dcinside.user.dto.response.UserResponseDto;
import com.study.dcinside.user.entity.User;
import com.study.dcinside.user.entity.UserRole;
import com.study.dcinside.user.exception.AlreadyExistEmailException;
import com.study.dcinside.user.exception.NotFoundUserException;
import com.study.dcinside.user.exception.NotMatchConfirmationPhrase;
import com.study.dcinside.user.exception.NotMatchCurrentPassword;
import com.study.dcinside.user.exception.NotSamePasswordAndCheckPasswordException;
import com.study.dcinside.user.exception.SameUsernameAndPasswordException;
import com.study.dcinside.user.exception.PleaseWritePasswordException;
import com.study.dcinside.user.exception.AlreadyExistUsernameException;
import com.study.dcinside.user.exception.PleaseWriteUsernameException;
import com.study.dcinside.user.repository.UserRepository;
import com.study.dcinside.user.service.UserImageService;
import com.study.dcinside.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserImageService userImageService;

    private static final String CONFIRMATION_PHRASE = "회원 탈퇴를 진행합니다.";

    @Override
    public SignUpResponseDto signUp(final SignUpRequestDto signUpRequestDto) {
        String username = signUpRequestDto.getUsername();
        String password = passwordEncoder.encode(signUpRequestDto.getPassword());
        String checkpassword = signUpRequestDto.getCheckPassword();

        // 회원 중복 확인
        Optional<User> checkUsername = userRepository.findByUsername(username);
        if (checkUsername.isPresent()) {
            throw new AlreadyExistUsernameException();
        }

        // 이메일 중복 확인
        String email = signUpRequestDto.getEmail();
        Optional<User> checkEmail = userRepository.findByEmail(email);
        if (checkEmail.isPresent()) {
            throw new AlreadyExistEmailException();
        }

        // 닉네임 3글자 이하 제한, 알파벳 대소문자(a~z, A~Z), 숫자(0~9)로 구성하지 않으면 예외 발생
        if (username.length() < 3 || !username.matches("^[a-zA-Z0-9]*$")) {
            throw new PleaseWriteUsernameException();
        }

        // 비밀번호 최소 4자 이상으로 하지 않으면 에외 발생
        if (password.length() < 4) {
            throw new PleaseWritePasswordException();
        }

        // 닉네임과 비밀번호에 같은 값이 포함되어 있는 경우
        if (password.contains(username) || username.contains(password)) {
            throw new SameUsernameAndPasswordException();
        }

        // 비밀번호 확인 시 비밀번호와 동일하지 않으면 예외 발생
        if (!password.equals(checkpassword)) {
            throw new NotSamePasswordAndCheckPasswordException();
        }

        // 사용자 등록
        User user = User.builder()
            .username(username)
            .password(password)
            .email(email)
            .role(UserRole.USER)
            .build();
        user = userRepository.save(user);

        return SignUpResponseDto.builder()
            .id(user.getId())
            .username(username)
            .password(password)
            .email(user.getEmail())
            .build();
    }

    @Override
    public UserResponseDto getUserData(User user) {
        return UserResponseDto.builder()
            .username(user.getUsername())
            .imagePath(user.getImagePath())
            .build();
    }

    // 회원 탈퇴
    @Override
    public void withdraw(UserWithdrawRequestDto userWithdrawRequestDto, User user) {
        User loginUser = userRepository.findById(user.getId()).orElseThrow(NotFoundUserException::new);

        if (!passwordEncoder.matches(userWithdrawRequestDto.getPassword(), user.getPassword())) {
            throw new NotMatchCurrentPassword();
        }

        if (!userWithdrawRequestDto.getConfirmationPhrase().equals(CONFIRMATION_PHRASE)) {
            throw new NotMatchConfirmationPhrase();
        }

        userImageService.deleteImage(user);
        userRepository.delete(loginUser);
    }
}
