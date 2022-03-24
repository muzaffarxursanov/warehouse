package com.example.warehouse.repository.user;

import com.example.warehouse.model.entity.user.WarehouseUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseUserRepository extends JpaRepository<WarehouseUser, Long> {
}
