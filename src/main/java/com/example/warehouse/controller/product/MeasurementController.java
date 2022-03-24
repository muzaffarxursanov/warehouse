package com.example.warehouse.controller.product;

import com.example.warehouse.repository.product.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {
    @Autowired
    MeasurementRepository measurementRepository;
}
