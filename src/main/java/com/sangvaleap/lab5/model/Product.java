package com.sangvaleap.lab5.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "product_type", discriminatorType = DiscriminatorType.STRING)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
}
