package com.example.sale.controller;

import com.example.sale.dto.PriceRangeDTO;
import com.example.sale.entity.Lands;
import com.example.sale.service.LandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "api/v1/lands")
@CrossOrigin(origins = "http://localhost:3000")

public class LandsController {
    @Autowired
    private LandsService landsService;

    @GetMapping("/search")
    public ResponseEntity<List<Lands>> searchLands(
            @RequestParam(value = "district", required = false) String district,
            @RequestParam(value = "town", required = false) String town,
            @RequestParam(value = "purpose", required = false) String purpose,
            @RequestParam(value = "priceRangeId", required = false) Long priceRangeId
    ) {
        List<Lands> lands = landsService.searchLands(district, town, purpose, priceRangeId);
        return ResponseEntity.ok(lands);
    }
    @GetMapping("/districts")
    public ResponseEntity<List<String>> getDistricts() {
        List<String> districts = landsService.getDistricts();
        return ResponseEntity.ok(districts);
    }

    @GetMapping("/towns")
    public ResponseEntity<List<String>> getTowns() {
        List<String> towns = landsService.getTowns();
        return ResponseEntity.ok(towns);
    }

    @GetMapping("/purposes")
    public ResponseEntity<List<String>> getPurposes() {
        List<String> purposes = landsService.getPurposes();
        return ResponseEntity.ok(purposes);
    }

    @GetMapping("/price-ranges")
    public ResponseEntity<List<PriceRangeDTO>> getPriceRanges() {
        List<PriceRangeDTO> priceRanges = landsService.getPriceRanges();
        return ResponseEntity.ok(priceRanges);
    }

}
