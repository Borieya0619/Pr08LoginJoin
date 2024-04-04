package org.example.pr08loginjoin;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResDTO {
    private String username;
    private String password;
}
