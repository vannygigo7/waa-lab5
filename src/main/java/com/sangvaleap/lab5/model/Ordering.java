package com.sangvaleap.lab5.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Ordering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderid;
    private LocalDate date;
    @ManyToOne
    private Customer customer;
    @OneToMany
    private List<OrderLine> orderLines;
}
