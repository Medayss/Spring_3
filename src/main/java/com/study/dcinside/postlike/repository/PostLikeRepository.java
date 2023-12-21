package com.study.dcinside.postlike.repository;

import com.study.dcinside.post.entity.Post;
import com.study.dcinside.postlike.entity.PostLike;
import com.study.dcinside.user.entity.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostLikeRepository extends JpaRepository<PostLike, Long> {

    Long countByPost(Post post);

    List<PostLike> findByUser(User user);

    Optional<PostLike> findByUserAndPostId(User loginUser, Long postId);

}
