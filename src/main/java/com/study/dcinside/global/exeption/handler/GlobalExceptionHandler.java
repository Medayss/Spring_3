package com.study.dcinside.global.exeption.handler;

import com.study.dcinside.comment.exception.NotFoundCommentException;
import com.study.dcinside.comment.exception.NotMatchCommentException;
import com.study.dcinside.global.exeption.dto.ExceptionResponseDto;
import com.study.dcinside.post.exception.IllegalBoardTypeException;
import com.study.dcinside.post.exception.NotFoundPostException;
import com.study.dcinside.post.exception.NotMatchUserException;
import com.study.dcinside.user.exception.*;
import com.study.dcinside.global.exeption.type.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalBoardTypeException.class)
    public ResponseEntity<ExceptionResponseDto> handleIllegalBoardTypeException() {
        return ResponseEntity
                .status(CustomException.ILLEGAL_BOARD_TYPE.getStatusCode())
                .body(CustomException.ILLEGAL_BOARD_TYPE.toDto());
    }

    @ExceptionHandler(NotFoundPostException.class)
    public ResponseEntity<ExceptionResponseDto> handleNotFoundBoardException() {
        return ResponseEntity
                .status(CustomException.NOT_FOUND_BOARD.getStatusCode())
                .body(CustomException.NOT_FOUND_BOARD.toDto());
    }

    @ExceptionHandler(NotMatchUserException.class)
    public ResponseEntity<ExceptionResponseDto> handleNotMatchUserException() {
        return ResponseEntity
                .status(CustomException.NOT_MATCH_USER.getStatusCode())
                .body(CustomException.NOT_MATCH_USER.toDto());
    }

    @ExceptionHandler(NotFoundCommentException.class)
    public ResponseEntity<ExceptionResponseDto> handleNotFoundCommentException() {
        return ResponseEntity
                .status(CustomException.NOT_FOUND_COMMENT.getStatusCode())
                .body(CustomException.NOT_FOUND_COMMENT.toDto());
    }

    @ExceptionHandler(NotMatchCommentException.class)
    public ResponseEntity<ExceptionResponseDto> handleNotMatchCommentException() {
        return ResponseEntity
                .status(CustomException.NOT_MATCH_COMMENT.getStatusCode())
                .body(CustomException.NOT_MATCH_COMMENT.toDto());
    }

    @ExceptionHandler(AlreadyExistEmailException.class)
    public ResponseEntity<ExceptionResponseDto> handleAlreadyExistEmailException() {
        return ResponseEntity
                .status(CustomException.ALREADY_EXIST_EMAIL.getStatusCode())
                .body(CustomException.ALREADY_EXIST_EMAIL.toDto());
    }

    @ExceptionHandler(AlreadyExistUsernameException.class)
    public ResponseEntity<ExceptionResponseDto> handleAlreadyExistUsernameException() {
        return ResponseEntity
                .status(CustomException.ALREADY_EXIST_USERNAME.getStatusCode())
                .body(CustomException.ALREADY_EXIST_USERNAME.toDto());
    }

    @ExceptionHandler(FailDeleteImageException.class)
    public ResponseEntity<ExceptionResponseDto> handleFailDeleteImageException() {
        return ResponseEntity
                .status(CustomException.FAIL_DELETE_IMAGE.getStatusCode())
                .body(CustomException.FAIL_DELETE_IMAGE.toDto());
    }

    @ExceptionHandler(FailUploadImageException.class)
    public ResponseEntity<ExceptionResponseDto> handleFailUploadImageException() {
        return ResponseEntity
                .status(CustomException.FAIL_UPLOAD_IMAGE.getStatusCode())
                .body(CustomException.FAIL_UPLOAD_IMAGE.toDto());
    }

    @ExceptionHandler(NoImageFileException.class)
    public ResponseEntity<ExceptionResponseDto> handleNoImageFileException() {
        return ResponseEntity
                .status(CustomException.NO_IMAGE_FILE.getStatusCode())
                .body(CustomException.NO_IMAGE_FILE.toDto());
    }

    @ExceptionHandler(NoImageTypeException.class)
    public ResponseEntity<ExceptionResponseDto> handleNoImageTypeException() {
        return ResponseEntity
                .status(CustomException.NO_IMAGE_TYPE.getStatusCode())
                .body(CustomException.NO_IMAGE_TYPE.toDto());
    }

    @ExceptionHandler(NotFoundUserException.class)
    public ResponseEntity<ExceptionResponseDto> handleNotFoundUserException() {
        return ResponseEntity
                .status(CustomException.NOT_FOUND_USER.getStatusCode())
                .body(CustomException.NOT_FOUND_USER.toDto());
    }

    @ExceptionHandler(NotMatchCheckPassword.class)
    public ResponseEntity<ExceptionResponseDto> handleNotMatchCheckPassword() {
        return ResponseEntity
                .status(CustomException.NOT_MATCH_CHECK_PASSWORD.getStatusCode())
                .body(CustomException.NOT_MATCH_CHECK_PASSWORD.toDto());
    }

    @ExceptionHandler(NotMatchConfirmationPhrase.class)
    public ResponseEntity<ExceptionResponseDto> handleNotMatchConfirmationPhrase() {
        return ResponseEntity
                .status(CustomException.NOT_MATCH_CONFIRMATION_PHRASE.getStatusCode())
                .body(CustomException.NOT_MATCH_CONFIRMATION_PHRASE.toDto());
    }

    @ExceptionHandler(NotMatchCurrentPassword.class)
    public ResponseEntity<ExceptionResponseDto> handleNotMatchCurrentPassword() {
        return ResponseEntity
                .status(CustomException.NOT_MATCH_CURRENT_PASSWORD.getStatusCode())
                .body(CustomException.NOT_MATCH_CURRENT_PASSWORD.toDto());
    }
}
