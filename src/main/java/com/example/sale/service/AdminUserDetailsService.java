package com.example.sale.service;

import com.example.sale.entity.Admin;
import com.example.sale.repo.Adminrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class AdminUserDetailsService implements UserDetailsService {

    @Autowired
    private Adminrepository adminrepository;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserDetails user = User.builder()
//                .username("janani")
//                .password(passwordEncoder.encode("janani2"))
//                .authorities(Collections.singletonList(new SimpleGrantedAuthority("ADMIN"))) // Add authorities here
//                .build();
//        return user;
//    }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Admin adminUser = adminrepository.findByUsername(username)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

            return new User(adminUser.getUsername(), adminUser.getPassword(), new ArrayList<>());
        }


}
