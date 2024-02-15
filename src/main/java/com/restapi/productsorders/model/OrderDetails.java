package com.restapi.productsorders.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="order_details")
public class OrderDetails {
    @Id
    private String orderId;
    private String orderAddress;
    //private int representativeId;
    @Column(length = 3000)
    private ArrayList<Object> productName;
    private int productId;
    public OrderDetails() {
    }

    public OrderDetails(String orderId, String orderAddress, ArrayList<Object> productName, int productId) {
        this.orderId = orderId;
        this.orderAddress = orderAddress;
        this.productName = productName;
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public ArrayList<Object> getProductName() {
        return productName;
    }

    public void setProductName(ArrayList<Object> productName) {
        this.productName = productName;
    }
}
