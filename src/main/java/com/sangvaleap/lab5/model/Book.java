package com.sangvaleap.lab5.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@DiscriminatorValue("book")
public class Book extends Product {

    private String title;

    public Book(String name, String description, String title) {
        super(name, description);
        this.title = title;
    }
}
