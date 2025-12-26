package com.example.demo.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {

    private static final String SECRET_KEY = "mysecretkey";

    // ✅ REQUIRED BY TEST CASE
    public String generateToken(String username, String role, Long userId) {

        return Jwts.builder()
                .setSubject(username)
                .claim("role", role)
                .claim("userId", userId)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    // ✅ REQUIRED BY TEST CASE
    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
