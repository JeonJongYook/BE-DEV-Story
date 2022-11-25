package com.example.vuebackboard.web.dtos;

import lombok.Data;

@Data
public class UserDto {
//    이메일,닉네임,아이디,비번
    private Long idx;
    private String userId;
    private String userPw;
    private String userEmail;
    private String userNickname;
}
