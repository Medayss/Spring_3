package com.study.card.Repository;

import com.study.card.Entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<CardEntity, Long> {
    List<CardEntity> findByBoard_boardId(Long boardId);
    List<CardEntity> findByMember_MemberId(Long memberId);
}

