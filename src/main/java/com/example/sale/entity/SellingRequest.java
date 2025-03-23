package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="selling_request")
public class SellingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fullName", nullable = false)
    private String fullName;
    @Column(name = "telephone", nullable = false)
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "address", nullable = false)
    private String address;
    @Lob
    @Column(name = "description")
    private String description;
    @Column(name = "town", nullable = false)
    private String town;
    @Column(name = "noOfPerches", nullable = false)
    private int noOfPerches;
    @Column(name = "pricePerPerch", nullable = false)
    private Long pricePerPerch;
    @Column(name = "files", length = 1000)
    private String files;


    public SellingRequest(Long id, String fullName, String telephone, String email, String address, String description, String town, int noOfPerches, Long pricePerPerch, String files) {
        this.id = id;
        this.fullName = fullName;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.description = description;
        this.town = town;
        this.noOfPerches = noOfPerches;
        this.pricePerPerch = pricePerPerch;
        this.files = files;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getNoOfPerches() {
        return noOfPerches;
    }

    public void setNoOfPerches(int noOfPerches) {
        this.noOfPerches = noOfPerches;
    }

    public Long getPricePerPerch() {
        return pricePerPerch;
    }

    public void setPricePerPerch(Long pricePerPerch) {
        this.pricePerPerch = pricePerPerch;
    }

    public List<String> getFileList() {
        return files != null ? Arrays.asList(files.split(",")) : new ArrayList<>();
    }

    public void setFileList(List<String> fileList) {
        this.files = String.join(",", fileList);
    }

}
