package com.example.sale.service;

import com.example.sale.dto.AppointmentDTO;
import com.example.sale.dto.SellingRequestDTO;
import com.example.sale.entity.Appointment;
import com.example.sale.entity.SellingRequest;
import com.example.sale.repo.SellingRequestRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SellingRequestService {

    @Autowired
    private SellingRequestRepo sellingRequestRepo;

    @Autowired
    private ModelMapper modelMapper;


    public SellingRequestDTO addRequest(SellingRequestDTO sellingRequestDTO){
        try{
            SellingRequest sellingRequest = modelMapper.map(sellingRequestDTO,SellingRequest.class);
            sellingRequestRepo.save(sellingRequest);
            return sellingRequestDTO;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Failed to save requesting: " + e.getMessage());
        }
    }

}
