package com.example.sale.service;

import com.example.sale.dto.LandsDTO;
import com.example.sale.dto.PriceRangeDTO;
import com.example.sale.dto.UserRegDTO;
import com.example.sale.entity.Lands;
import com.example.sale.entity.PriceRanges;
import com.example.sale.entity.Purposes;
import com.example.sale.entity.UserReg;
import com.example.sale.repo.LandsRepo;
import com.example.sale.repo.PriceRangesRepo;
import com.example.sale.repo.PurposesRepo;
import com.example.sale.repo.UserRegRepo;
import com.example.sale.specification.LandSpecification;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Join;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class LandsService {

    @Autowired
    private LandsRepo landsRepo;

    @Autowired
    private PurposesRepo purposesRepository;

    @Autowired
    private PriceRangesRepo priceRangesRepository;

    public List<Lands> searchLands(String district, String town, String purpose, Long priceRangeId) {
        Specification<Lands> spec = Specification.where(null);
        if (district != null && !district.isEmpty()) {
            spec = spec.and(LandSpecification.hasDistrict(district));
        }
        if (town != null && !town.isEmpty()) {
            spec = spec.and(LandSpecification.hasTown(town));
        }
        if (purpose != null && !purpose.isEmpty()) {
            spec = spec.and(LandSpecification.hasPurpose(purpose));
        }
        if (priceRangeId != null) {
            spec = spec.and(LandSpecification.hasPriceRange(priceRangeId));
        }

        return landsRepo.findAll(spec);
    }

    public List<String> getDistricts() {
        return landsRepo.findAll().stream()
                .map(Lands::getDistrict)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getTowns() {
        return landsRepo.findAll().stream()
                .map(Lands::getTown)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getPurposes() {
        return purposesRepository.findAll().stream()
                .map(Purposes::getPurposeName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<PriceRangeDTO> getPriceRanges() {
        return priceRangesRepository.findAll().stream()
                .map(priceRange -> new ModelMapper().map(priceRange, PriceRangeDTO.class))
                .collect(Collectors.toList());

    }

}
