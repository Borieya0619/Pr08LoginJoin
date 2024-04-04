package org.example.pr08loginjoin;

import lombok.Data;

@Data
public class JoinReqDTO {
    private String username;
    private String email;
    private String password;
    private String password2;
}