package com.study.card.Service;

import com.study.card.DTO.MemberDTO;
import com.study.card.Entity.MemberEntity;
import com.study.card.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    public final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }
    public MemberDTO login(MemberDTO memberDTO) {
        Optional<MemberEntity> byMemberName = memberRepository.findByMemberName(memberDTO.getMemberName());
        if (byMemberName.isPresent()) {
            MemberEntity memberEntity = byMemberName.get();
            if (memberEntity.getMemberPassword().equals(memberDTO.getMemberPassword())) {
                MemberDTO dto = MemberDTO.toMemberDTO(memberEntity);
                return dto;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
                return null;
            }
        } else {
            System.out.println("해당 아이디로 등록된 회원이 없습니다.");
            return null;
        }
    }
}
