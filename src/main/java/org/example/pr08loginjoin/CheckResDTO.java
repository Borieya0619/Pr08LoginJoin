package org.example.pr08loginjoin;

import lombok.Data;

// 로그인, 회원가입 정보의 유효성 검사 결과를 반환하는 dto
@Data
public class CheckResDTO {
    private String message;
}
