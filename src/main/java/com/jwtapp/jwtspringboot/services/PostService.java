package com.jwtapp.jwtspringboot.services;

import com.jwtapp.jwtspringboot.responses.PostResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    List<PostResponse> getAllPosts();

}
