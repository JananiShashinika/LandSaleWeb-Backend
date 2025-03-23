package com.example.sale.repo;

import com.example.sale.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Adminrepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);

}
