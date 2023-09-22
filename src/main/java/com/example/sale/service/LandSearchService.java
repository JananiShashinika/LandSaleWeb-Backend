package com.example.sale.service;

import com.example.sale.dto.LandDTO;

import com.example.sale.dto.UserDTO;
import com.example.sale.dto.UserRegDTO;
import com.example.sale.entity.Land;

import com.example.sale.entity.User;
import com.example.sale.entity.UserReg;
import com.example.sale.repo.LandRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LandSearchService {

    @Autowired
    private LandRepo landRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<LandDTO> getLandByDistrict(String District) {
        List<Land>landList = landRepo.getLandByDistrict(District);
        return modelMapper.map(landList, new TypeToken<List<LandDTO >> () {}.getType());
    }
    public List<LandDTO> getLandByDistrictTown(String District,String Town) {
    List<Land>landList = landRepo.getLandByDistrictTown(District,Town);
        return modelMapper.map(landList, new TypeToken<List<LandDTO >> () {
    }.getType());
}
    public List<LandDTO> getLandByDistrictTownPurpose(String District,String Town,String Purpose) {
        List<Land>landList = landRepo.getLandByDistrictTownPurpose(District,Town,Purpose);
        return modelMapper.map(landList, new TypeToken<List<LandDTO >> () {
        }.getType());
    }
    public List<LandDTO> getLandByDistrictTownPurposePrice(String District,String Town,String Purpose, String Price) {
        List<Land>landList = landRepo.getLandByDistrictTownPurposePrice(District,Town,Purpose,Price);
        return modelMapper.map(landList, new TypeToken<List<LandDTO >> () {
        }.getType());
    }

    public LandDTO saveLand(LandDTO landDTO) {
        landRepo.save(modelMapper.map(landDTO, Land.class));
        return landDTO;
    }

    public LandDTO updateLand(LandDTO landDTO){
        landRepo.save(modelMapper.map(landDTO, Land.class));
        return landDTO;
    }



//    User user = userRepo.getUserByUserIDAndAddress(userId, address);
//        return modelMapper.map(user, UserDTO .class);
}


