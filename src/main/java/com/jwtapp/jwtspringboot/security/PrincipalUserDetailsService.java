package com.jwtapp.jwtspringboot.security;

import com.jwtapp.jwtspringboot.DTO.UserDto;
import com.jwtapp.jwtspringboot.entities.UserEntity;
import com.jwtapp.jwtspringboot.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PrincipalUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user = userRepository.findByEmail(username);

        if (user == null) throw new UsernameNotFoundException("User with this email is not Found!");

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);

        UserPrincipal userPrincipal = new UserPrincipal(userDto);

        return userPrincipal;
    }

}

