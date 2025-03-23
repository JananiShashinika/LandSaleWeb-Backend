package com.example.sale.service;

import com.example.sale.entity.User;
import com.example.sale.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepo userRepo;

    public User authenticate(String username, String password){
        return userRepo.findByUsername(username)
                .filter(user -> user.getPassword().equals(password))
                .orElse(null);
    }
}
