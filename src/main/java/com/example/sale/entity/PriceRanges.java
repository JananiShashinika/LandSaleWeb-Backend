package com.example.sale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor

@Table(name = "priceRanges")
public class PriceRanges {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_range_id")
    private Long priceRangeId;

    @Column(name = "range_name", nullable = false)
    private String rangeName;

    @ManyToMany(mappedBy = "priceRanges")
    private Set<Lands> lands = new HashSet<>();

    public PriceRanges(Long priceRangeId, String rangeName) {
        this.priceRangeId = priceRangeId;
        this.rangeName = rangeName;
    }

    public Long getPriceRangeId() {
        return priceRangeId;
    }

    public void setPriceRangeId(Long priceRangeId) {
        this.priceRangeId = priceRangeId;
    }

    public String getRangeName() {
        return rangeName;
    }

    public void setRangeName(String rangeName) {
        this.rangeName = rangeName;
    }
}
