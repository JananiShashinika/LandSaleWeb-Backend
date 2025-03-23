package com.example.sale.repo;

import com.example.sale.entity.Purposes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurposesRepo extends JpaRepository<Purposes,Long> {
}
