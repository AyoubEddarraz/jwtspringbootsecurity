package com.jwtapp.jwtspringboot.servicesImp;

import com.jwtapp.jwtspringboot.entities.UserEntity;
import com.jwtapp.jwtspringboot.repositories.UserRepository;
import com.jwtapp.jwtspringboot.requests.UserRequest;
import com.jwtapp.jwtspringboot.responses.UserResponse;
import com.jwtapp.jwtspringboot.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserResponse register(UserRequest userRequest) {

        UserEntity userExist = userRepository.findByEmail(userRequest.getEmail());

        if (userExist != null) throw new RuntimeException("this is already used please enter other email!");

        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(userRequest, user);

        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        user.setRole("ROLE_ADMIN");
        user.setPermission("ALL");

        UserEntity userSaved = userRepository.save(user);

        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(userSaved , userResponse);

        return userResponse;
    }

}
