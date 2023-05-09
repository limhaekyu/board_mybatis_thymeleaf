package com.board_mybatis_thymeleaf.service;

import com.board_mybatis_thymeleaf.dto.MemberDTO;

import java.util.List;

public interface MemberService {
    void signUp(MemberDTO memberDTO);

    List<MemberDTO> findAll();
}
