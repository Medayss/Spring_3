package com.study.dcinside.post.repository;

import com.study.dcinside.post.entity.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByOrderByCreateAtDesc();

    List<Post> findByUserId(Long userId);
}
