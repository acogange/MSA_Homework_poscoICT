package com.example.userService.dto;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class LoginDto {
    private String token;
    private String name;
    private String img;
}
