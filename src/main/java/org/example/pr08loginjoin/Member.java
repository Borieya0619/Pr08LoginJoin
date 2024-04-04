package org.example.pr08loginjoin;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class Member {
    private String username;
    private String password;
    private String email;
    private LocalDate joindate;

}