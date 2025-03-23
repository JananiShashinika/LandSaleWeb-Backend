package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="booking_land")


public class BookLand {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "town")
    private String town;

    @Column(name = "land_name")
    private String landName;

    @Column(name = "land_no")
    private String landNo;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "tel")
    private String tel;

    @Column(name = "extra")
    private String extra;

    public BookLand(int id, String town, String landName, String landNo, String fullName, String tel, String extra) {
        this.id = id;
        town = town;
        landName = landName;
        landNo = landNo;
        fullName = fullName;
        tel = tel;
        extra = extra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        town = town;
    }

    public String getLandName() {
        return landName;
    }

    public void setLandName(String landName) {
        landName = landName;
    }

    public String getLandNo() {
        return landNo;
    }

    public void setLandNo(String landNo) {
        landNo = landNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        fullName = fullName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        tel = tel;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        extra = extra;
    }
}
