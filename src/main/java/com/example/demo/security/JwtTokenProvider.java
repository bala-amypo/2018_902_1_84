package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String generateToken(String email) {
        return "dummy-jwt-token-for-" + email;
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("dummy");
    }
}
