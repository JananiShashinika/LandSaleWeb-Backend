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

    @Column(name = "appointment_type")
    private String AppointmentType;
    @Column(name = "Note")
    private String Note;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "fk_UserName")
    private UserReg userReg;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "fk_Password")
    private UserReg userRegs;





    //  private enum App_Type {Booking,Appointment,Reserve}





//    @ManyToMany
//    @JoinTable(name = "appointment_request",
//              joinColumns = @JoinColumn(name = "App_No"),
//              inverseJoinColumns = @JoinColumn(name = "UserID"))
//    private List<User> users;


}
