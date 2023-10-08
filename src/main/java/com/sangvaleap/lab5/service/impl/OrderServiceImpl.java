package com.sangvaleap.lab5.service.impl;

import com.sangvaleap.lab5.model.Order;
import com.sangvaleap.lab5.repository.OrderRepository;
import com.sangvaleap.lab5.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order order) throws Exception {
        if (!orderRepository.existsById(id)) {
            throw new Exception("Order is not found");
        }
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {

    }


}
