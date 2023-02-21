package com.cgr.cgrApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name="Form")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identificaction_number;

    private String status;

    private String question_one;

    private String question_two;

    private String question_three;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date createdAt;

    @PrePersist
    private void onCrete(){
        createdAt = new Date();
    }
}
