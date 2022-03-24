package com.example.warehouse.controller.product.input;

import com.example.warehouse.repository.product.input.InputProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inputProduct")
public class InputProductController {
    @Autowired
    InputProductRepository inputProductRepository;
}
