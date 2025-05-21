package org.alexej.demo.config;

import org.alexej.demo.repository.Product;
import org.alexej.demo.repository.ProductRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements ApplicationRunner {
    private final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (productRepository.count() == 0) {
            productRepository.saveAll(List.of(
               new Product("Product 1", 11.99, "https://", "Some description"),
               new Product("Product 2", 12.99, "https://", "Some description"),
               new Product("Product 3", 13.99, "https://", "Some description")
            ));
            System.out.println("Demo users inserted (config/DataInitializer)");
        }
    }
}
