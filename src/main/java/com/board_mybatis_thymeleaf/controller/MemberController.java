package com.board_mybatis_thymeleaf.controller;

import com.board_mybatis_thymeleaf.dto.MemberDTO;
import com.board_mybatis_thymeleaf.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/sign-up/form")
    public String signUpView() {
        return "";
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody MemberDTO memberDTO) {
        memberService.signUp(memberDTO);
    }

    @GetMapping("/list")
    public void findMemberList(){
        memberService.findAll();
    }
}
