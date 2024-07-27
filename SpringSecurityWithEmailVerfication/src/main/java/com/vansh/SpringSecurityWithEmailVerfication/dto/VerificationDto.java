package com.vansh.SpringSecurityWithEmailVerfication.dto;

import lombok.Data;

@Data
public class VerificationDto {
    private String email;
    private String verificationCode;

}
