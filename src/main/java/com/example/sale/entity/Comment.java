package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "comment")

public class Comment  {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ComID")
    private int ComID;
    @Column(name = "Comment")
    private String Comment;



    //public String U_Name;




}
