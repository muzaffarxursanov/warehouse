package com.example.warehouse.controller.product.output;

import com.example.warehouse.repository.product.output.OutputProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/outputProduct")
public class OutputProductController {
    @Autowired
    OutputProductRepository outputProductRepository;
}
