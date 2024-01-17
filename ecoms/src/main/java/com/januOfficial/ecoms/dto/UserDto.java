package com.januOfficial.ecoms.dto;

import com.januOfficial.ecoms.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole userRole;
}
