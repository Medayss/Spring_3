package com.study.card.DTO;

import com.study.card.Entity.CardEntity;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CardDTO {
    private Long cardId;
    private String cardText;
    private Long boardId;
    private Long memberId;

    public static CardDTO toCardDTO(CardEntity cardEntity) {
        CardDTO cardDTO = new CardDTO();
        cardDTO.setCardId(cardEntity.getCardId());
        cardDTO.setCardText(cardEntity.getCardText());
        cardDTO.setBoardId(cardEntity.getBoard().getBoardId());
        cardDTO.setMemberId(cardEntity.getMember().getMemberId());
        return cardDTO;
    }

    public static List<CardDTO> toCardDTOList(List<CardEntity> cardEntities) {
        return cardEntities.stream().map(CardDTO::toCardDTO).collect(Collectors.toList());
    }
}
