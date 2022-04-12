package com.jwtapp.jwtspringboot.repositories;

import com.jwtapp.jwtspringboot.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByEmail(String email);

}
