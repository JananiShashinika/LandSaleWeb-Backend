package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)    //To auto generate a ID no
    private int AgentID;
    private String AgentName;
    private String AgentMNumber;
    private String AgentEmail;


}
