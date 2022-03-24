package com.example.warehouse.repository.product.input;

import com.example.warehouse.model.entity.product.input.Input;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InputRepository extends JpaRepository<Input, Long> {
}
