package com.restapi.productsorders.service;

import com.restapi.productsorders.model.OrderDetails;
import com.restapi.productsorders.model.ProductDetails;
import com.restapi.productsorders.model.ProductOrderDetails;
import com.restapi.productsorders.model.RepresentativeDetails;

import java.util.List;

public interface OrderService {
    public OrderDetails createOrderDetails(OrderDetails orderDetails);
    public List<OrderDetails> getAllOrderDetails();
    public OrderDetails getOrderDetailsByOrderId(String orderId);

}
