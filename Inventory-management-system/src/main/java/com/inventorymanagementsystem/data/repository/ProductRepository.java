package com.inventorymanagementsystem.data.repository;


import com.inventorymanagementsystem.data.model.Product;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);
    Optional<Product> findByProductId(Long productId);
}
