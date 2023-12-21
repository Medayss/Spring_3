package com.study.dcinside.postlike.service;

import com.study.dcinside.user.entity.User;

public interface PostLikeService {

    void likePost(Long postId, User user);

    void unlikePost(Long postId, User user);

}
