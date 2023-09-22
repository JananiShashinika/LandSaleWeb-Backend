package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="booking_land")


public class BookLand {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Town")
    private String Town;

    @Column(name = "land_name")
    private String LandName;

    @Column(name = "land_no")
    private String LandNo;

    @Column(name = "full_name")
    private String FullName;

    @Column(name = "Tel")
    private String Tel;

    @Column(name = "Extra")
    private String Extra;

}
