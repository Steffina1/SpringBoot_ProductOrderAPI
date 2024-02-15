package com.restapi.productsorders.service.implementation;

import com.restapi.productsorders.model.OrderDetails;
import com.restapi.productsorders.model.ProductDetails;
import com.restapi.productsorders.repository.OrderRepository;
import com.restapi.productsorders.repository.ProductsOrderRepository;
import com.restapi.productsorders.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderImplementation implements OrderService {
    OrderRepository orderRepository;

    public OrderImplementation(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public OrderDetails createOrderDetails(OrderDetails orderDetails) {
        orderRepository.save(orderDetails);
        return orderDetails;
    }

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        return orderRepository.findAll();
    }

    @Override
    public OrderDetails getOrderDetailsByOrderId(String orderId) {
        return  orderRepository.findById(orderId).get();
    }


}
