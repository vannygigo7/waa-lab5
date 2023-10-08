package com.sangvaleap.lab5.controller;

import com.sangvaleap.lab5.dto.ProductDTO;
import com.sangvaleap.lab5.model.Product;
import com.sangvaleap.lab5.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping({"/products"})
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping({"/{id}"})
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody ProductDTO productDTO) {
        System.out.println(productDTO);
        Product product = productDTO.toProduct();
        return productService.addProduct(product);
//        return productDTO.toProduct();
    }

    @PutMapping({"/{id}"})
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) throws Exception {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
    }
}
