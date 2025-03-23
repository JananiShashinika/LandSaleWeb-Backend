package com.example.sale.repo;

import com.example.sale.entity.PriceRanges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PriceRangesRepo extends JpaRepository<PriceRanges, Long> {
}
