package com.example.warehouse.repository.product;

import com.example.warehouse.model.entity.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
