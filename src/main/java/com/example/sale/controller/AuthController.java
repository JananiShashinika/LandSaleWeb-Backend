package com.example.sale.controller;

import com.example.sale.entity.User;
import com.example.sale.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
//        (value = "api/vi/auth")
@CrossOrigin
//        (origins = "http://localhost:3000")

public class AuthController {

    @Autowired
    private AuthService authService;



//    @GetMapping("/hi")
//    public String getHello(){
//        return "Hi";
//    }
//    @PostMapping("/login")
//    public String login(){
//        return "user login";
//    }

//    @PostMapping("/AdminLogin")
//    public ResponseEntity<?> login(@RequestBody User user) {
//        User authenticatedUser = authService.authenticate(user.getUsername(), user.getPassword());
//        if (authenticatedUser != null) {
//            Map<String, String> response = new HashMap<>();
//            response.put("message", "Login successful");
//            response.put("role", authenticatedUser.getRole());
//            return ResponseEntity.ok(response);
//        } else {
//            Map<String, String> errorResponse = new HashMap<>();
//            errorResponse.put("message", "Invalid credentials");
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
//        }
//    }
}
