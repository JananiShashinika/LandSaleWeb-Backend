package com.example.sale.controller;

import com.example.sale.dto.LandDTO;

import com.example.sale.dto.UserDTO;
import com.example.sale.repo.LandRepo;
import com.example.sale.service.LandSearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "api/v1/land")
@RestController
@CrossOrigin
public class LandSearchController {
    @Autowired
    private LandSearchService landSearchService;
    @Autowired
    private LandRepo landRepo;

    @GetMapping("/getLandByDistrict/{District}")
    public List<LandDTO> getLandByDistrict(@PathVariable String District ) {
        return landSearchService.getLandByDistrict(District);

    }
    @GetMapping("/getLandByDistrictTown/{District}/{Town}")
    public List<LandDTO> getLandByDistrictTown(@PathVariable String District, @PathVariable String Town ) {
        return landSearchService.getLandByDistrictTown(District,Town);
    }


    @GetMapping("/getLandByDistrictTownPurpose/{District}/{Town}/{Purpose}")
    public List<LandDTO> getLandByDistrictTownPurpose(@PathVariable String District,@PathVariable String Town,
                                                      @PathVariable String Purpose) {
        return landSearchService.getLandByDistrictTownPurpose(District,Town,Purpose); }

    @GetMapping("/getLandByDistrictTownPurposePrice/{District}/{Town}/{Purpose}/{Price}")
    public List<LandDTO> getLandByDistrictTownPurposePrice(@PathVariable String District,@PathVariable String Town,
                                                            @PathVariable String Purpose, @PathVariable String Price) {
        return landSearchService.getLandByDistrictTownPurposePrice(District,Town,Purpose,Price); }



    @PostMapping("/saveLand")
    public LandDTO saveLand(@RequestBody LandDTO landDTO) {
        return landSearchService.saveLand(landDTO);
    }

    @DeleteMapping("/deleteLand/{LandNo}")
    public String  deleteLand(@PathVariable int LandNo){
        landRepo.deleteById(LandNo);
        return "Land deleted: " +LandNo;
    }

    @PutMapping("/updateLand")
    public LandDTO updateLand(@RequestBody LandDTO landDTO) {
        return landSearchService.updateLand(landDTO);
    }

}
