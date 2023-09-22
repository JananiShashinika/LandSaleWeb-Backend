package com.example.sale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AppointmentDTO {

    private int App_No;
    private Timestamp Date_Time;
    @Column(name = "appointment_type")
    private String AppointmentType;
    private String Note;



 //   private enum App_Type {Booking,Appointment,Reserve}






}
