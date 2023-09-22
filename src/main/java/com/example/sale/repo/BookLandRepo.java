package com.example.sale.repo;

import com.example.sale.entity.BookLand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookLandRepo extends JpaRepository<BookLand,Integer> {
}
