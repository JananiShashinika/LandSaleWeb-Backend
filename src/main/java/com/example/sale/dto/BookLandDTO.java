package com.example.sale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookLandDTO {

    @Column(name = "id")
    private int id;

    @Column(name = "Town")
    private String Town;

    @Column(name = "land_name")
    private String LandName;

    @Column(name = "land_no")
    private String LandNo;

    @Column(name = "full_name")
    private String FullName;

    @Column(name = "Tel")
    private String Tel;

    @Column(name = "Extra")
    private String Extra;
}
