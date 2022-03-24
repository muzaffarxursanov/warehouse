package com.example.warehouse.controller.product.input;

import com.example.warehouse.repository.product.input.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/input")
public class InputController {
    @Autowired
    InputRepository inputRepository;
}
