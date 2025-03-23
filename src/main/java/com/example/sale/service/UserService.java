package com.example.sale.service;

import com.example.sale.dto.UserDTO;
import com.example.sale.entity.User;
import com.example.sale.repo.UserRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService{
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO){

        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
    public List<UserDTO> getAllAUsers(){
       List<User>userList=userRepo.findAll();   //TO get all the data in user table - by spring data jpa
       return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;

    }

    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }

    //user id > user details  (get user details by user id-filter)
    //select * from user where id = 2
    //--->go repo
    public UserDTO getUserByUserID(String id){
        User user=userRepo.getUserByUserId(id);

        return modelMapper.map(user,UserDTO.class);
    }

    //user, address > user details (get user details by user id & address)
    //select * from user where id = 2 and address = "kandy"
    public UserDTO getUserByUserIDUsernamePassword(String id, String username, String password) {
        User user = userRepo.getUserByUserIdUsernamePassword(id, username,password);
        return modelMapper.map(user, UserDTO.class);
    }

}
