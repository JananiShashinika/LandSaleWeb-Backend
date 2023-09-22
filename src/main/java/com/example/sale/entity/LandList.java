package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="landList")


public class LandList {
    @Column(name = "District")
    public String District;
    @Column(name = "City")
    public String City;
    @Column(name = "Purpose")
    public String Purpose;
     @Column(name = "Budget")
    public int Budget;

}
