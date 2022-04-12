package com.jwtapp.jwtspringboot.responses;

import lombok.Data;

@Data
public class UserResponse {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String permission;
    private boolean blocked;

}
