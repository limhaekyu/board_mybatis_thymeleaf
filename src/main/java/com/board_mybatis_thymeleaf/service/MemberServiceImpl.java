package com.board_mybatis_thymeleaf.service;

import com.board_mybatis_thymeleaf.dao.MemberDAO;
import com.board_mybatis_thymeleaf.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memberService")
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberDAO memberDao;

    @Override
    public void signUp(MemberDTO memberDTO) {
        memberDao.signUp(memberDTO);
    }

    @Override
    public List<MemberDTO> findAll() {
        return memberDao.findAll();
    }


}
