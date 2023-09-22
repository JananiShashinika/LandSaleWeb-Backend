package com.example.sale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AgentDTO {
    private int AgentID;
    private String AgentName;
    private String AgentMNumber;
    private String AgentEmail;
}
