package com.sangvaleap.lab5.controller;

import com.sangvaleap.lab5.model.Order;
import com.sangvaleap.lab5.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping({"/orders"})
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping({"/{id}"})
    public Order getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @PutMapping
    public Order addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @PutMapping({"/{id}"})
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) throws Exception {
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}
