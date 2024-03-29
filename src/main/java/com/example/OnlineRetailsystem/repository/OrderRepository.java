package com.example.OnlineRetailsystem.repository;

import com.example.OnlineRetailsystem.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByCustomerId(int customerId);
}
