package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor //Constructor


@Data  //for getters/setters
@Table(name = "user")

public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String username;
    private String password;
    private String role;

//    private int   UserID;   //id
//    private String name;
//    private String address;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)


    public User(int id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
//    @ManyToMany(mappedBy = "users")                  // Not the table names of user
//    private List<Appointment> appointment;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
