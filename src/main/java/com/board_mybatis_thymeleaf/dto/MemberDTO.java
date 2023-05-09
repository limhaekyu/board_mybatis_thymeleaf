package com.board_mybatis_thymeleaf.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    private Long memberIdx;
    private String memberId;
    private String password;
    private String name;
    private String email;
}
