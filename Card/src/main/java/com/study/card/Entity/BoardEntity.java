package com.study.card.Entity;

import com.study.card.DTO.BoardDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long boardId;

    @Column(unique = true)
    private String boardName;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<CardEntity> cards;

    public static BoardEntity toBoardEntity(BoardDTO boardDTO) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardName(boardDTO.getBoardName());
        // 기타 필드 설정...

        return boardEntity;
    }
}
