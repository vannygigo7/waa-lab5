package com.sangvaleap.lab5.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
//@DiscriminatorValue("book")
public class Book extends Product {
    private String title;
}
