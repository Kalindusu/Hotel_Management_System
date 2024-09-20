package com.ceylontours.CeylonToursHotel.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.security.PrivateKey;

@Data
public class LoginRequest {
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message = "password is required")
    private String password;

}
