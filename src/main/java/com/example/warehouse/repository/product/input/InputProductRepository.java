package com.example.warehouse.repository.product.input;

import com.example.warehouse.model.entity.product.input.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}
