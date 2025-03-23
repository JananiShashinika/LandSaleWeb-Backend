package com.example.sale.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

//@Component
public class PasswordHashing implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        String password = "janani";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println("Hashed Password: " + hashedPassword);
    }

}
