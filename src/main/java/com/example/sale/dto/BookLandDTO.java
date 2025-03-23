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
    private String town;

    @Column(name = "land_name")
    private String landName;

    @Column(name = "land_no")
    private String landNo;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "Tel")
    private String tel;

    @Column(name = "Extra")
    private String extra;
}
