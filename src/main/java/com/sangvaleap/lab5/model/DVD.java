package com.sangvaleap.lab5.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
//@DiscriminatorValue("dvd")
public class DVD extends Product {
    private String genre;

    public DVD(String name, String description, String genre) {
        super(name, description);
        this.genre = genre;
    }
}
