package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")

public class Roles {

    @Id
    @Column(name = "roles")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RoleID;
    private String name;

    @Override
    public String toString(){
        return this.name;
    }

}
