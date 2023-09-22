package com.example.sale.entity;

import java.util.List;
import java.util.Set;

import com.example.sale.dto.AppointmentDTO;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import javax.persistence.*;


@Entity
@AllArgsConstructor             //for Constructor
@NoArgsConstructor
@Data
@Table(name="user_reg")


public class UserReg {
    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int UserID;
    @Column(name = "user_name")
    public String UserName;

    @Column(name = "role")
    private String role;

     //public enum Role{Customer,Agent,Admin}
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


//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "users_roles",
//            joinColumns = @JoinColumn(name = "UserID"),
//            inverseJoinColumns = @JoinColumn(name = "RoleID")
//    )
//    private Set<Role> roles = new HashSet<>();                    //Object
//    public void addRole(Role role){
//        this.roles.add(role);}

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_UserName")
    @JsonManagedReference
    private Set<Appointment> appointments;
}
