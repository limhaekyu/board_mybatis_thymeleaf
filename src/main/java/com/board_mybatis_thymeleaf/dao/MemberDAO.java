package com.board_mybatis_thymeleaf.dao;

import com.board_mybatis_thymeleaf.dto.MemberDTO;

import java.util.List;

public interface MemberDAO {

    // 회원가입
    void signUp(MemberDTO memberDTO);

    // 회원 전체 조회
    List<MemberDTO> findAll();
}
