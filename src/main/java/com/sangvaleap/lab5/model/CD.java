package com.sangvaleap.lab5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
//@DiscriminatorValue("cd")
public class CD extends Product {
    private String artist;

    public CD(String name, String description, String artist) {
        super(name, description);
        this.artist = artist;
    }
}
