package org.example.pr08loginjoin;

import lombok.Data;

// 로그인, 회원가입 정보의 유효성 check하는 dto
@Data
public class CheckReqDTO {
    private String username;
    private String password;
}