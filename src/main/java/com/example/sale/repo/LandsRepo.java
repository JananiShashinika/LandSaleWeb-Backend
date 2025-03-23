package com.example.sale.repo;

import com.example.sale.entity.Lands;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LandsRepo extends JpaRepository<Lands, Long> {
    List<Lands> findAll(Specification<Lands> spec);
}