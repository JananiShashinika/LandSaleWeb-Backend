package com.example.sale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class LandDTO {

    @Column(name="land_no ")
    private int LandNo;
    @Column(name="district ")
    private String District;
    @Column(name="town ")
    private String Town;
    @Column(name="purpose ")
    private String Purpose;
    @Column(name="price ")
    private String Price;
    @Column(name=" status")
    private String Status;

//    private String Details;
//    private String Certificates;
//private int No_of_Perches;





}
