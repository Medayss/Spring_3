package com.study.card.Service;

import com.study.card.DTO.BoardDTO;
import com.study.card.Entity.BoardEntity;
import com.study.card.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void saveBoard(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toBoardEntity(boardDTO);
        boardRepository.save(boardEntity);
    }

    public List<BoardDTO> getAllBoards() {
        List<BoardEntity> boardEntities = boardRepository.findAll();
        return BoardDTO.toBoardDTOList(boardEntities);
    }
}
