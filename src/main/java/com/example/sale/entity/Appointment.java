package com.example.sale.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "App_No")
    private int App_No;

    @CreationTimestamp
    @Column(name = "Date_Time")
   private Timestamp Date_Time;

    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "message")
    private String message;
    @Column(name="checked", nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean isChecked=false;


    public Appointment(int app_No, String name, String phone, String message, boolean isChecked) {
        this.App_No = app_No;
        this.name = name;
        this.phone = phone;
        this.message = message;
        this.isChecked = isChecked;
    }

    public int getApp_No() {
        return App_No;
    }

    public void setApp_No(int app_No) {
        this.App_No = app_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
    //    @JsonBackReference
//    @ManyToOne
//    @JoinColumn(name = "fk_UserName")
//    private UserReg userReg;
//
//    @JsonBackReference
//    @ManyToOne
//    @JoinColumn(name = "fk_Password")
//    private UserReg userRegs;





    //  private enum App_Type {Booking,Appointment,Reserve}





//    @ManyToMany
//    @JoinTable(name = "appointment_request",
//              joinColumns = @JoinColumn(name = "App_No"),
//              inverseJoinColumns = @JoinColumn(name = "UserID"))
//    private List<User> users;


}
