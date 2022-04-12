package com.jwtapp.jwtspringboot.requests;

import lombok.Data;

@Data
public class PostRequest {

    private String title;
    private String description;
    private boolean completed;

}
