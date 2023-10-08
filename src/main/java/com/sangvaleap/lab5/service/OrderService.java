package com.sangvaleap.lab5.service;

import com.sangvaleap.lab5.model.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getOrders();

    public Order getOrderById(Long id);

    public Order addOrder(Order order);

    public Order updateOrder(Long id, Order order) throws Exception;

    public void deleteOrder(Long id);
}
