package com.jwtapp.jwtspringboot.DTO;

import lombok.Data;

@Data
public class UserDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
    private String permission;
    private boolean blocked;

}
