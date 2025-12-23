package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final JwtTokenProvider jwtTokenProvider;

    public UserServiceImpl(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public AuthResponse register(AuthRequest request) {
        return new AuthResponse(jwtTokenProvider.generateToken(request.getEmail()));
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        return new AuthResponse(jwtTokenProvider.generateToken(request.getEmail()));
    }
}
