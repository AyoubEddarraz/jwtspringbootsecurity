package com.jwtapp.jwtspringboot.controllers;

import com.jwtapp.jwtspringboot.requests.UserRequest;
import com.jwtapp.jwtspringboot.responses.UserResponse;
import com.jwtapp.jwtspringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/public/auth")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok().body(userService.register(userRequest));
    }

}
