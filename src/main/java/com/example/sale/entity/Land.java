package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "land")
public class Land {
    @Id
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


//    @Column(name=" no_of_perches")
//    private int No_of_Perches;
//    @Column(name="details ")
//    private String Details;
//    @Column(name=" ")
//    private String Certificates;



}
