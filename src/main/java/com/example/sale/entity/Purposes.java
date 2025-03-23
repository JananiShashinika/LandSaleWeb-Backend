package com.example.sale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "purposes")
public class Purposes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purpose_id")
    private Long purposeId;

    @Column(name = "purpose_name", nullable = false)
    private String purposeName;

    @ManyToMany(mappedBy = "purposes")
    private Set<Lands> lands = new HashSet<>();

    public Purposes(Long purposeId, String purposeName) {
        this.purposeId = purposeId;
        this.purposeName = purposeName;
    }

    public Long getPurposeId() {
        return purposeId;
    }

    public void setPurposeId(Long purposeId) {
        this.purposeId = purposeId;
    }

    public String getPurposeName() {
        return purposeName;
    }

    public void setPurposeName(String purposeName) {
        this.purposeName = purposeName;
    }
}
