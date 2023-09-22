package com.example.sale.repo;

import com.example.sale.dto.LandDTO;
import com.example.sale.entity.Land;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LandRepo extends JpaRepository<Land,Integer> {
    @Query(value= "SELECT * FROM Land WHERE District = ?1 ",nativeQuery = true)
    List<Land> getLandByDistrict(String District);
    @Query(value = "SELECT * FROM LAND WHERE DISTRICT = ?1 AND TOWN = ?2 ",nativeQuery = true)
    List<Land> getLandByDistrictTown(String District,String Town);

    @Query(value = "SELECT * FROM LAND WHERE DISTRICT = ?1 AND TOWN = ?2 AND PURPOSE = ?3",nativeQuery = true)
    List<Land> getLandByDistrictTownPurpose(String District,String Town,String Purpose);
    @Query(value = "SELECT * FROM LAND WHERE DISTRICT = ?1 AND TOWN = ?2 AND PURPOSE = ?3 AND PRICE =?4",nativeQuery = true)
    List<Land> getLandByDistrictTownPurposePrice(String District,String Town,String Purpose,String Price);



}
