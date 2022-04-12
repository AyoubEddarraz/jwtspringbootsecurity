package com.jwtapp.jwtspringboot.DTO;

import lombok.Data;

@Data
public class PostDto {

    private int id;
    private String title;
    private String description;
    private boolean completed;

}
