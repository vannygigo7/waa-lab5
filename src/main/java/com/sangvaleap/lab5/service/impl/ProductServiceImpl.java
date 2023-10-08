package com.sangvaleap.lab5.service.impl;

import com.sangvaleap.lab5.model.Book;
import com.sangvaleap.lab5.model.CD;
import com.sangvaleap.lab5.model.DVD;
import com.sangvaleap.lab5.model.Product;
import com.sangvaleap.lab5.repository.BookRepository;
import com.sangvaleap.lab5.repository.CDRepository;
import com.sangvaleap.lab5.repository.DVDRepository;
import com.sangvaleap.lab5.repository.ProductRepository;
import com.sangvaleap.lab5.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final BookRepository bookRepository;
    private final CDRepository cdRepository;
    private final DVDRepository dvdRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product addProduct(Product product) {
        System.out.println("===addProduct===");
        System.out.println(product);
        if (product instanceof Book) {
            return bookRepository.save((Book) product);
        } else if (product instanceof CD) {
            return cdRepository.save((CD) product);
        } else if (product instanceof DVD) {
            return dvdRepository.save((DVD) product);
        }
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) throws Exception {
        if (!productRepository.existsById(id)) {
            throw new Exception("Product is not found.");
        }
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
