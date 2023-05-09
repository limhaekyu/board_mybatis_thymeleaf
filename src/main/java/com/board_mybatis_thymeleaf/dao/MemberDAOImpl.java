package com.board_mybatis_thymeleaf.dao;

import com.board_mybatis_thymeleaf.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("memberDAO")
@RequiredArgsConstructor
public class MemberDAOImpl implements MemberDAO{

    private final SqlSessionTemplate sessionTemplate;

    @Override
    public void signUp(MemberDTO memberDTO) {
        sessionTemplate.insert("com.config.MemberMapper.joinMember",memberDTO);
    }

    @Override
    public List<MemberDTO> findAll() {
        return sessionTemplate.selectList("com.config.MemberMapper.findAll");
    }
}
