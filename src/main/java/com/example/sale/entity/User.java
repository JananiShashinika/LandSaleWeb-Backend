package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@NoArgsConstructor //Constructor
@AllArgsConstructor
@Data  //for getters/setters
@Table(name = "user")

public class User {
    @Id
    private int   UserID;   //id
    private String name;
    private String address;


//    @ManyToMany(mappedBy = "users")                  // Not the table names of user
//    private List<Appointment> appointment;


    public int getUserID() {
        return UserID;
    }
    public void setUserID(int userID) {
        UserID = userID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
