package com.cgr.cgrApp.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name="Complaints")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String facts;


    private String entity;

    private String municipality;

    private String name_othr_entity;

    private String email_user;

    private Integer verification_code;

    private String status;

    private String field_number;

    private String contract_number;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date createdAt;

    @PrePersist
    private void onCrete(){
        createdAt = new Date();
    }
}
