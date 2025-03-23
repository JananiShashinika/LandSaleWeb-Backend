package com.example.sale.controller;

import com.example.sale.dto.AppointmentDTO;
import com.example.sale.dto.SellingRequestDTO;
import com.example.sale.repo.SellingRequestRepo;
import com.example.sale.service.SellingRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping(value = "api/v1/Selling")
@RestController

public class SellingRequestController {
    @Autowired
    private SellingRequestService sellingRequestService;

    @Autowired
    private SellingRequestRepo sellingRequestRepo;

    @PostMapping("/addRequest")
    public SellingRequestDTO addRequest(@RequestBody SellingRequestDTO sellingRequestDTO){
       return sellingRequestService.addRequest(sellingRequestDTO);

        }
    }

