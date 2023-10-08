package com.sangvaleap.lab5.service;

import com.sangvaleap.lab5.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProducts();

    public Product getProductById(Long id);

    public Product addProduct(Product product);

    public Product updateProduct(Long id, Product product) throws Exception;

    public void deleteProductById(Long id);
}
