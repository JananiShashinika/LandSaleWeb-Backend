package com.example.sale.specification;

import com.example.sale.entity.Lands;
import com.example.sale.entity.PriceRanges;
import com.example.sale.entity.Purposes;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;

public class LandSpecification {

    public static Specification<Lands> hasDistrict(String district) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("district"), district);
    }

    public static Specification<Lands> hasTown(String town) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("town"), town);
    }

    public static Specification<Lands> hasPurpose(String purpose) {
        return (root, query, criteriaBuilder) -> {
            Join<Lands, Purposes> landPurposesJoin = root.join("purposes");
            return criteriaBuilder.equal(landPurposesJoin.get("purposeName"), purpose);
        };
    }

    public static Specification<Lands> hasPriceRange(Long priceRangeId) {
        return (root, query, criteriaBuilder) -> {
            Join<Lands, PriceRanges> landPriceRangesJoin = root.join("priceRanges");
            return criteriaBuilder.equal(landPriceRangesJoin.get("priceRangeId"), priceRangeId);
        };
    }
}
