package com.sangvaleap.lab5.controller;

import com.sangvaleap.lab5.model.Customer;
import com.sangvaleap.lab5.model.Order;
import com.sangvaleap.lab5.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping({"/customers"})
public class CustomController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping({"/{id}"})
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping({"/{id}"})
    public Customer saveCustomer(@PathVariable Long id, @RequestBody Customer customer) throws Exception {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
    }

    @GetMapping({"/{id}/orders"})
    public List<Order> getCustomerOrders(@PathVariable Long id) {
        return customerService.getCustomerOrders(id);
    }

    @GetMapping({"/{id}/orders/{orderId}"})
    public Order getCustomerOrders(@PathVariable Long id, @PathVariable Long orderId) {
        return customerService.findCustomerOrderByOrderId(id, orderId);
    }

    @PostMapping({"/{id}/orders"})
    public Order addCustomerOrder(@PathVariable Long id, @RequestBody Order order) throws Exception {
        return customerService.addCustomerOrder(id, order);
    }
}
