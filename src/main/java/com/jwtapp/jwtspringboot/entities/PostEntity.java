package com.jwtapp.jwtspringboot.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "posts")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title" , length = 255, nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "completed")
    private boolean completed;

}
