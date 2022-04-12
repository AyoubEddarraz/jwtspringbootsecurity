package com.jwtapp.jwtspringboot.controllers;

import com.jwtapp.jwtspringboot.responses.PostResponse;
import com.jwtapp.jwtspringboot.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/public")
@CrossOrigin
public class PublicRestApiController {

    @Autowired
    private PostService postService;

    @GetMapping(path = "/posts")
    public ResponseEntity<List<PostResponse>> posts() {
        return ResponseEntity.ok().body(postService.getAllPosts());
    }


}
