package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void login(AuthRequest request) {
        String email = request.getEmail();
        String password = request.getPassword();

        // TODO: login logic
    }

    @Override
    public void register(AuthRequest request) {
        String email = request.getEmail();
        String password = request.getPassword();

        // TODO: register logic
    }
}
