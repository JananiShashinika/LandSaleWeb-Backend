package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lands")

public class Lands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "landId")
    private Long landId;

    @Column(name = "landName", nullable = false)
    private String landName;

    @Column(name = "town", nullable = false)
    private String town;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "coverImage", nullable = false)
    private String coverImage;
    @Column(name = "backgroundImage",nullable = false)
    private String backgroundImage;

    @Column(name = "noOfPerches", nullable = false)
    private int noOfPerches;

    @Column(name = "pricePerPerch")
    private double pricePerPerch;

    @Column(name = "pricePerSlot")
    private double pricePerSlot;
    @Column(name = "perchPerSlot")
    private int perchPerSlot;
    @Column(name = "noOfSlots")
    private Integer noOfSlots;
    @Column(name = "availableSlots")
    private Integer availableSlots;
    @Column(name = "soldSlots")
    private Integer soldSlots;

    @Column(name = "purpose", nullable = false)
    private String purpose;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "landAgentName")
    private String landAgentName;
    @Column(name = "agentContact")
    private String agentContact;
    @Column(name = "location")
    private String location;

    @ElementCollection
    @CollectionTable(name = "land_images", joinColumns = @JoinColumn(name = "land_id"))
    @Column(name = "image_url")
    private List<String> landData;

    @Column(name = "slotsDistributionPic")
    private String slotsDistributionPic;
    @Column(name = "mapLink")
    private String mapLink;

    @Column(name = "landView")
    private String landView;

    @Column(name = "videoLink")
    private String videoLink;

    @Column(name = "creationDate")
    private Timestamp creationDate;

    @Column(name = "lastUpdated")
    private Timestamp lastUpdated;

    @ManyToMany
    @JoinTable(
            name = "land_purposes",
            joinColumns = @JoinColumn(name = "land_id"),
            inverseJoinColumns = @JoinColumn(name = "purpose_id")
    )
    private Set<Purposes> purposes = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "land_price_ranges",
            joinColumns = @JoinColumn(name = "land_id"),
            inverseJoinColumns = @JoinColumn(name = "price_range_id")
    )
    private Set<PriceRanges> priceRanges = new HashSet<>();

    public Long getLandId() {
        return landId;
    }

    public void setLandId(Long landId) {
        this.landId = landId;
    }

    public String getLandName() {
        return landName;
    }

    public void setLandName(String landName) {
        this.landName = landName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public int getNoOfPerches() {
        return noOfPerches;
    }

    public void setNoOfPerches(int noOfPerches) {
        this.noOfPerches = noOfPerches;
    }

    public double getPricePerPerch() {
        return pricePerPerch;
    }

    public void setPricePerPerch(double pricePerPerch) {
        this.pricePerPerch = pricePerPerch;
    }

    public double getPricePerSlot() {
        return pricePerSlot;
    }

    public void setPricePerSlot(double pricePerSlot) {
        this.pricePerSlot = pricePerSlot;
    }

    public int getPerchPerSlot() {
        return perchPerSlot;
    }

    public void setPerchPerSlot(int perchPerSlot) {
        this.perchPerSlot = perchPerSlot;
    }

    public Integer getNoOfSlots() {
        return noOfSlots;
    }

    public void setNoOfSlots(Integer noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public Integer getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(Integer availableSlots) {
        this.availableSlots = availableSlots;
    }

    public Integer getSoldSlots() {
        return soldSlots;
    }

    public void setSoldSlots(Integer soldSlots) {
        this.soldSlots = soldSlots;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLandAgentName() {
        return landAgentName;
    }

    public void setLandAgentName(String landAgentName) {
        this.landAgentName = landAgentName;
    }

    public String getAgentContact() {
        return agentContact;
    }

    public void setAgentContact(String agentContact) {
        this.agentContact = agentContact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getLandData() {
        return landData;
    }

    public void setLandData(List<String> landData) {
        this.landData = landData;
    }

    public String getSlotsDistributionPic() {
        return slotsDistributionPic;
    }

    public void setSlotsDistributionPic(String slotsDistributionPic) {
        this.slotsDistributionPic = slotsDistributionPic;
    }

    public String getMapLink() {
        return mapLink;
    }

    public void setMapLink(String mapLink) {
        this.mapLink = mapLink;
    }

    public String getLandView() {
        return landView;
    }

    public void setLandView(String landView) {
        this.landView = landView;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
