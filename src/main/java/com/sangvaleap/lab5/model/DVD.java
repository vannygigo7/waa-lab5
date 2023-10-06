package com.sangvaleap.lab5.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
//@DiscriminatorValue("dvd")
public class DVD extends Product {
    private String genre;
}
