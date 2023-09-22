//package com.example.sale.configuration;
//
//import org.springframework.security.web.util.matcher.RequestMatcher;
//
//import net.bytebuddy.build.Plugin;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.security.Security;
//
//@Configuration
//@EnableWebSecurity
//
//public class ApplicationSecurityConfiguration {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        return http
//                .csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/api/v1/open").permitAll()
//                .and()
//                .authorizeHttpRequests().requestMatchers("/api/v1/**").authenticated()
//                .and()
//                .httpBasic()
//                .and().build();
//    }
//
//
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder encoder){
//        UserDetails janani = User
//                .withUsername("janani")
//                .password(encoder.encode("password"))
//                .roles("ADMIN")
//
//                .build();
//
//        return new InMemoryUserDetailsManager(janani);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    }
