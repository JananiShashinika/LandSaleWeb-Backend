package com.example.sale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LandsDTO {

    private Long landId;
    private String landName;
    private String town;
    private String district;
    private int noOfPerches;
    private double pricePerPerch;
    private Integer perchPerSlot;
    private String purpose;
    private String status;
    private String description;
    private String location;
    private List<String> landData;
    private String landView;
    private String coverImage;
    private String backgroundImage;
    private double pricePerSlot;
    private int noOfSlots;
    private int availableSlots;
    private int soldSlots;
    private String landAgentName;
    private String agentContact;
    private String slotsDistributionPic;
    private String mapLink;
    private String videoLink;
    private Timestamp creationDate;
    private Timestamp lastUpdated;

}