package com.example.sale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserRegDTO {
    @Column(name = "userid")
    public int UserID;
    @Column(name = "user_name")
    public String UserName;

    @Column(name = "role")
    private String role;

   // public enum role {Customer,Agent,Admin}
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "password")
    public String password;

    @Column(name = "address")
    private String address;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "nic")
    private String NIC;

    private List<AppointmentDTO> appointment;

}
