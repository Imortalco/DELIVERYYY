package com.mimi.FoodDelivery.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="order")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="date")
    private Date date;

    @Column(name="received")
    private Boolean received;

    @Column(name="order_list")
    private String orderList;

    public Order() {
    }

    public Order(Long id, String customerName, Date date, Boolean received, String orderList) {
        this.id = id;
        this.customerName = customerName;
        this.date = date;
        this.received = received;
        this.orderList = orderList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getReceived() {
        return received;
    }

    public void setReceived(Boolean received) {
        this.received = received;
    }

    public String getOrderList() {
        return orderList;
    }

    public void setOrderList(String orderList) {
        this.orderList = orderList;
    }
}
