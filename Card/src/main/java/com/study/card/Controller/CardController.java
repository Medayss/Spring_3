package com.study.card.Controller;

import com.study.card.DTO.CardDTO;
import com.study.card.DTO.MemberDTO;
import com.study.card.Service.CardService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/todo/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping("/createCard")
    public String getCreateCardPage(Model model, HttpSession session) {
        // 세션에서 현재 로그인한 사용자의 아이디를 가져옴
        Long memberId = (Long) session.getAttribute("loginMemberId");
        if (memberId == null) {
            // 로그인되지 않은 경우 로그인 페이지로 이동
            return "redirect:/todo/member/login";
        }

        model.addAttribute("memberId", memberId);
        return "createCard";
    }

    @PostMapping("/save")
    public String saveCard(@RequestParam String cardText, @RequestParam Long memberId) {
        cardService.saveCard(cardText, memberId);
        return "redirect:/todo/card/createCard";
    }

    @GetMapping("/list")
    public String getCardList(Model model, HttpSession session) {
        Long memberId = (Long) session.getAttribute("loginMemberId");
        if (memberId == null) {
            // 로그인되지 않은 경우 로그인 페이지로 이동
            return "redirect:/todo/member/login";
        }

        List<CardDTO> cards = cardService.getCardsByMemberId(memberId);
        model.addAttribute("cards", cards);
        return "cardList";
    }

    @GetMapping("/cards")
    public String getCards(Model model, HttpSession session) {
        // 세션에서 로그인한 사용자의 정보를 가져옴
        MemberDTO memberDTO = (MemberDTO) session.getAttribute("loginMember");
        Long memberId = memberDTO.getMemberId(); // 사용자의 ID를 가져옴

        // 사용자의 ID로 카드 목록을 가져옴
        List<CardDTO> cards = cardService.getCardsByMemberId(memberId);

        model.addAttribute("cards", cards);
        return "cardList";
    }
}