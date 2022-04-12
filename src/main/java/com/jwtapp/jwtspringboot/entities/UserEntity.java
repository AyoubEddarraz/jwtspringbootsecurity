package com.jwtapp.jwtspringboot.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName" , length = 50)
    private String firstName;

    @Column(name = "lastName" , length = 50)
    private String lastName;

    @Column(name = "email" , length = 255, unique = true, nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "permission")
    private String permission;

    @Column(name = "blocked")
    private boolean blocked;

}
