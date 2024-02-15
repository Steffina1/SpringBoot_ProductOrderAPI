package com.restapi.productsorders.repository;

import com.restapi.productsorders.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetails, String> {
}
