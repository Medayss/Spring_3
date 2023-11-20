package com.study.card.Controller;

import com.study.card.DTO.BoardDTO;
import com.study.card.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/boards")
    public String getAllBoards(Model model) {
        model.addAttribute("boards", boardService.getAllBoards());
        return "boardList"; // 보드 목록을 보여주는 Thymeleaf 템플릿 이름
    }

    @GetMapping("/boards/new")
    public String showCreateBoardForm() {
        return "createBoard"; // 보드 생성 폼을 보여주는 Thymeleaf 템플릿 이름
    }

    @PostMapping("/boards/new")
    public String createBoard(BoardDTO boardDTO) {
        boardService.saveBoard(boardDTO);
        return "redirect:/boards";
    }
}
