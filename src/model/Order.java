/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ThienThu
 */
public class Order {
     private String orderId;
    private String customerId;
    private List<Product> products;
    private Date orderDate;
    private String status;

    public Order() {
    }
    

    public Order(String orderId, String customerId, List<Product> products, Date orderDate, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.products = products;
        this.orderDate = orderDate;
        this.status = status;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public int compareTo(Order o) {
        return this.orderId.compareTo(o.getOrderId());
    }

}
