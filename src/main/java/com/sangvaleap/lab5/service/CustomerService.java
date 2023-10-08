package com.sangvaleap.lab5.service;

import com.sangvaleap.lab5.model.Customer;
import com.sangvaleap.lab5.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public Customer findCustomerById(Long id);

    public Customer addCustomer(Customer customer);

    public Customer updateCustomer(Long id, Customer customer) throws Exception;

    public void deleteCustomerById(Long id);

    public List<Order> getCustomerOrders(Long id);

    public Order findCustomerOrderByOrderId(Long id, Long orderId);

    public Order addCustomerOrder(Long id, Order order) throws Exception;
}
