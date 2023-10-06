package com.sangvaleap.lab5.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int quantity;
    @ManyToOne
    private Product product;
}
