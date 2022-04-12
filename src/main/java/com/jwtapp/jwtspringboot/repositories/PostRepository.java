package com.jwtapp.jwtspringboot.repositories;

import com.jwtapp.jwtspringboot.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {

}
