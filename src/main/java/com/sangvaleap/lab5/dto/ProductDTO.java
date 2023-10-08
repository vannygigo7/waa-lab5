package com.sangvaleap.lab5.dto;

import com.sangvaleap.lab5.model.Book;
import com.sangvaleap.lab5.model.CD;
import com.sangvaleap.lab5.model.DVD;
import com.sangvaleap.lab5.model.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProductDTO extends Product {
    private String title;
    private String artist;
    private String genre;

    public Product toProduct() {
        Product product;
        if (this.getTitle() != null && !this.getTitle().isEmpty()) {
            product = new Book(this.getName(), this.getDescription(), this.getTitle());
        } else if (this.getArtist() != null && !this.getArtist().isEmpty()) {
            product = new CD(this.getName(), this.getDescription(), this.getArtist());
        } else if (this.getGenre() != null && !this.getGenre().isEmpty()) {
            product = new DVD(this.getName(), this.getDescription(), this.getGenre());
        } else {
            product = null;
        }
        return product;
    }

}
