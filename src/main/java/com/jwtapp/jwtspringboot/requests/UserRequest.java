package com.jwtapp.jwtspringboot.requests;

import lombok.Data;

@Data
public class UserRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
