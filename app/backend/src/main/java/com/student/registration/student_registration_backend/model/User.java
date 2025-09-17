package com.student.registration.student_registration_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Table; 
import java.math.BigDecimal;
import jakarta.persistence.Column;


@Entity // This annotation from Lombok automatically generates getters, setters, and other methods.
@Table(name = "users")   // table name in DB
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String course;
    private String studentClass;

    @Column(precision = 5, scale = 2)  // e.g. 99.99
    private BigDecimal percentage;
    private String branch;
    private String mobileNumber;
}
