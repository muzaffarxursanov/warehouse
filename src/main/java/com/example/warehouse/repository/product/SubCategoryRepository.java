package com.example.warehouse.repository.product;

import com.example.warehouse.model.entity.product.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
