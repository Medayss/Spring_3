package com.study.card.DTO;

import com.study.card.Entity.BoardEntity;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDTO {
    private Long boardId;
    private String boardName;

    public static BoardDTO toBoardDTO(BoardEntity boardEntity) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoardId(boardEntity.getBoardId());
        boardDTO.setBoardName(boardEntity.getBoardName());
        return boardDTO;
    }

    public static List<BoardDTO> toBoardDTOList(List<BoardEntity> boardEntities) {
        return boardEntities.stream()
                .map(BoardDTO::toBoardDTO)
                .collect(Collectors.toList());
    }
}
