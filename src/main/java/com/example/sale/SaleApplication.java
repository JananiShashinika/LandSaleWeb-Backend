package com.example.sale;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.example.sale")

public class SaleApplication {
    public static void main(String[] args){SpringApplication.run(SaleApplication.class, args); }
    @Bean
    public ModelMapper modelMapper( ){
        return new ModelMapper();
    }







}
