package com.example.sale.controller;

import com.example.sale.dto.UserDTO;
import com.example.sale.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUser() {
        return userService.getAllAUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO) {
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{id}")
    public UserDTO getUserByUserId(@PathVariable String id){

        return userService.getUserByUserID(id);
    }

    @GetMapping("/getUserByUserIdUsernamePassword/{id}/{username}/{password}")
    public UserDTO getUserByUserIdUsernamePassword(@PathVariable String id ,@PathVariable String username,
                                             @PathVariable String password){
        System.out.println("User ID :"+id + "Username :"+username + "Password :"+password);
        return userService.getUserByUserIDUsernamePassword(id,username,password);
    }
}
