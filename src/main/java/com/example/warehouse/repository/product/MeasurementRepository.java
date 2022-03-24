package com.example.warehouse.repository.product;

import com.example.warehouse.model.entity.product.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
