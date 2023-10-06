package com.sangvaleap.lab5.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
//@DiscriminatorValue("cd")
public class CD extends Product {
    private String artist;

}
