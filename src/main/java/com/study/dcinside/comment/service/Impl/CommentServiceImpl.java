package com.study.dcinside.comment.service.Impl;

import com.study.dcinside.comment.dto.request.CommentRequestDto;
import com.study.dcinside.comment.dto.respons.CommentResponseDto;
import com.study.dcinside.comment.entity.Comment;
import com.study.dcinside.comment.exception.NotFoundCommentException;
import com.study.dcinside.comment.repository.CommentRepository;
import com.study.dcinside.comment.service.CommentService;
import com.study.dcinside.post.entity.Post;
import com.study.dcinside.post.repository.PostRepository;
import com.study.dcinside.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @Override
    public CommentResponseDto createComment(CommentRequestDto commentRequestDto, User user, Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(NotFoundCommentException::new);
        Comment comment = Comment.builder()
                .content(commentRequestDto.getContent())
                .user(user)
                .post(post)
                .build();

        comment = commentRepository.save(comment);

        return new CommentResponseDto(comment);
    }

    @Override
    public CommentResponseDto modifyComment(CommentRequestDto commentRequestDTO, User user, Long commentId) {
        Comment comment = commentRepository.findById(commentId).orElseThrow(NotFoundCommentException::new);
        if (!user.getId().equals(comment.getUser().getId())) {
            throw new NotFoundCommentException();
        }
        comment.modifyContent(commentRequestDTO.getContent());
        return new CommentResponseDto(comment);
    }

    @Override
    public CommentResponseDto deleteComment(User user, Long commentId) {
        Comment comment = commentRepository.findById(commentId).orElseThrow(NotFoundCommentException::new);
        Long userId = comment.getUser().getId();

        if (!userId.equals(user.getId())) {
            throw new NotFoundCommentException();
        }
        commentRepository.delete(comment);
        return new CommentResponseDto(comment);
    }
}
