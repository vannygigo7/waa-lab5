package com.sangvaleap.lab5.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    @OneToMany(mappedBy = "customer")
    private List<Ordering> orders;
}
