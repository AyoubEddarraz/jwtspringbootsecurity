package com.jwtapp.jwtspringboot.servicesImp;

import com.jwtapp.jwtspringboot.entities.PostEntity;
import com.jwtapp.jwtspringboot.repositories.PostRepository;
import com.jwtapp.jwtspringboot.responses.PostResponse;
import com.jwtapp.jwtspringboot.services.PostService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImp implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<PostResponse> getAllPosts() {

        List<PostEntity> posts = postRepository.findAll();

        List<PostResponse> allPosts = new ArrayList<>();

        for (PostEntity post: posts) {
            PostResponse postResponse = new PostResponse();
            BeanUtils.copyProperties(post , postResponse);
            allPosts.add(postResponse);
        }

        return allPosts;

    }

}
