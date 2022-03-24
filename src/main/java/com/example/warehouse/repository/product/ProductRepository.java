package com.example.warehouse.repository.product;

import com.example.warehouse.model.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
