package com.example.sale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Lob;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SellingRequestDTO {

    private Long id;
    private String fullName;
    private String telephone;
    private String email;
    private String address;
    private String description;
    private String town;
    private int noOfPerches;
    private Long pricePerPerch;
    private String files;

}
