package com.example.sale.controller;

import com.example.sale.dto.UserDTO;
import com.example.sale.dto.UserRegDTO;
import com.example.sale.repo.UserRegRepo;
import com.example.sale.service.UserRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value  = "api/v1/userRegistration")
@CrossOrigin

public class UserRegController {
    @Autowired
    private UserRegService userRegService;
    @Autowired
    private UserRegRepo userRegRepo;

    @PostMapping("/addData")
    public UserRegDTO saveData(@RequestBody UserRegDTO userRegDTO) {
        return userRegService.saveData(userRegDTO);
    }


    @DeleteMapping("/deleteData/{UserID}")
    public String deleteData(@PathVariable int UserID){
        userRegRepo.deleteById(UserID);
        return "User deleted with id : " +UserID;

    }
    @GetMapping("/getData")
    public List<UserRegDTO> getAllData(){
        return userRegService.getAllData();
    }

    @PutMapping("/updateUser")
    public UserRegDTO updateUser(@RequestBody UserRegDTO userRegDTO) {
        return userRegService.updateUser(userRegDTO);
    }



}


