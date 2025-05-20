package org.alexej.demo.service;

import org.alexej.demo.repository.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    public List<Product> getProducts() {
        return List.of(
                new Product("Product 1", 9.5, "path1", "description of product 1"),
                new Product("Product 2", 19.5, "path2", "description of product 2")
        );
    }
}
