package com.example.sale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    // Forward non-API requests to the React app's index.html
    @GetMapping("/{path:^(?!api).*}")
    public String forward() {
        return "forward:/RegisterForm.html";
    }
}
