package com.jwtapp.jwtspringboot.responses;

import lombok.Data;

@Data
public class PostResponse {

    private int id;
    private String title;
    private String description;
    private boolean completed;

}
