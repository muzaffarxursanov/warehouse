package com.example.warehouse.controller.user;

import com.example.warehouse.repository.user.WarehouseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouseUser")
public class WarehouseUserController {
    @Autowired
    WarehouseUserRepository warehouseUserRepository;
}
