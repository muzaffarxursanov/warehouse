package com.example.warehouse.repository.product;

import com.example.warehouse.model.entity.product.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
