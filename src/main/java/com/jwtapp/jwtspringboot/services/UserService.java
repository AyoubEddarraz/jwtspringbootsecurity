package com.jwtapp.jwtspringboot.services;

import com.jwtapp.jwtspringboot.requests.UserRequest;
import com.jwtapp.jwtspringboot.responses.UserResponse;

public interface UserService {

    UserResponse register(UserRequest userRequest);

}
