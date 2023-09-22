package com.example.sale.entity;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "payment")

public class  Payment {
      @Id
      @GeneratedValue
      private int Payment_id;

//      @Reference       int User_ID;

      @CreationTimestamp
      @Column(name = "Date_Time")
      private Timestamp Date_Time;

      public enum Payment_Type{Full,Half}
      public enum Payment_Method{Cash,Online}
      private String Status;
      private String Total_Price;
      private String Paid_Amount;
      private String Due_Amount;

     // Due_amount= Total_Price - Paid_Amount;
}
