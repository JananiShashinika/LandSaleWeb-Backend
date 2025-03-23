package com.example.sale.controller;

import com.example.sale.dto.AuthenticationRequest;
import com.example.sale.dto.AuthenticationResponse;
import com.example.sale.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationManagerResolver;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value= "api/auth")
@CrossOrigin

public class AdminController {

   private final JWTService jwtService;
   private final AuthenticationManager authenticationManager;
   private final UserDetailsService userDetailsService;

   @Autowired
    public AdminController(JWTService jwtService, AuthenticationManager authenticationManager, UserDetailsService userDetailsService) {
       this.jwtService = jwtService;
       this.authenticationManager = authenticationManager;
       this.userDetailsService = userDetailsService;
   }

    @GetMapping("/hi")
    public String getHello(){

        return "Hi";
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> Login (@RequestBody AuthenticationRequest request){
       try{
           Authentication authentication = authenticationManager.authenticate(
                   new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
           );

           UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
           String jwtToken = jwtService.generateToken(new HashMap<>(), userDetails); // Provide an empty HashMap


           return ResponseEntity.ok(new AuthenticationResponse((jwtToken)));
       }catch (Exception e){
           return ResponseEntity.badRequest().body(new AuthenticationResponse(e.getMessage()));
       }
    }

//    @PostMapping("/login")
//    public String login(){
//        return jwtService.getJWTToken();
//    }

    @GetMapping("/username")
    public String getUsername(@RequestParam String token){
        return jwtService.getUsername(token);
    }

}
