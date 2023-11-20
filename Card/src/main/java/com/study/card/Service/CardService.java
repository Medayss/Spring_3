package com.study.card.Service;

import com.study.card.DTO.CardDTO;
import com.study.card.Entity.CardEntity;
import com.study.card.Entity.MemberEntity;
import com.study.card.Repository.CardRepository;
import com.study.card.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardService {

    private final CardRepository cardRepository;
    private MemberRepository memberRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void saveCard(String cardText, Long memberId) {
        MemberEntity memberEntity = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("Member not found"));

        CardEntity card = new CardEntity();
        card.setCardText(cardText);
        card.setMember(memberEntity); // 사용자 아이디 설정
        cardRepository.save(card);
    }

    public List<CardDTO> getCardsByMemberId(Long memberId) {
        List<CardEntity> cardEntities = cardRepository.findByMember_MemberId(memberId);
        return cardEntities.stream().map(CardDTO::toCardDTO).collect(Collectors.toList());
    }
}
