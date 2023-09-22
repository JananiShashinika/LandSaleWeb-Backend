package com.example.sale.service;

import com.example.sale.dto.UserDTO;
import com.example.sale.dto.UserRegDTO;
import com.example.sale.entity.User;
import com.example.sale.entity.UserReg;
import com.example.sale.repo.UserRegRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class UserRegService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRegRepo userRegRepo;

    public UserRegDTO saveData(UserRegDTO userRegDTO){
        userRegRepo.save(modelMapper.map(userRegDTO, UserReg.class));
        return userRegDTO;
    }

//    public RegistrationFormDTO deleteData(RegistrationFormDTO registrationFormDTO){
//        registrationFormRepo.delete(modelMapper.map(UserID, RegistrationForm.class));
//        return registrationFormDTO;
//    }



    public List<UserRegDTO> getAllData() {
        List<UserReg>userRegList=userRegRepo.findAll();
        return modelMapper.map(userRegList, new TypeToken<List<UserRegDTO>>(){}.getType());

    }

    public UserRegDTO updateUser(UserRegDTO userRegDTO){
        userRegRepo.save(modelMapper.map(userRegDTO, UserReg.class));
        return userRegDTO;

    }
















//    public String saveFName(String f_Name){
//        return f_Name;
//    }
//
//    public String saveLName(String l_Name){
//        return l_Name;
//    }
//
//    public String getFullName(String f_Name, String l_Name){
//        String fullName = +f_Name  +l_Name;
//
//        return fullName;
//    }
//    public String savePassword(String password,String password_check){
//        if(password==password_check){
//            return password;
//        }else{
//            return "Password is not match";
//        }
//    }
//    public String saveAddress(String address){
//        return address;
//    }
//    public String saveTelephoneNo(String telephone){
//        return telephone;
//    }
//    public String saveEmail(String email){
//        return email;
//    }
//    public String saveNIC(String NIC){
//        return NIC;
//    }

}
