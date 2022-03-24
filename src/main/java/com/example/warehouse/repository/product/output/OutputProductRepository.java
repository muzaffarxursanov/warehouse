package com.example.warehouse.repository.product.output;

import com.example.warehouse.model.entity.product.output.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
}
