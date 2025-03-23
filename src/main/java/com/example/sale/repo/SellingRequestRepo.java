package com.example.sale.repo;

import com.example.sale.entity.Appointment;
import com.example.sale.entity.SellingRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellingRequestRepo extends JpaRepository<SellingRequest,Integer> {


    }
