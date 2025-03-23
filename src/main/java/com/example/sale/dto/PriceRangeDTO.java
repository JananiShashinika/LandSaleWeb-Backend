package com.example.sale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PriceRangeDTO {
    private Long priceRangeId;
    private String rangeName;
}
