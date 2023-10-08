package com.sangvaleap.lab5.service.impl;

import com.sangvaleap.lab5.model.Customer;
import com.sangvaleap.lab5.model.Order;
import com.sangvaleap.lab5.repository.CustomerRepository;
import com.sangvaleap.lab5.repository.OrderRepository;
import com.sangvaleap.lab5.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) throws Exception {
        if (!customerRepository.existsById(id)) {
            throw new Exception("customer is not found.");
        }
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Order> getCustomerOrders(Long id) {
        return orderRepository.findOrdersByCustomer_Id(id);
    }

    @Override
    public Order findCustomerOrderByOrderId(Long id, Long orderId) {
        return orderRepository.findOrderByCustomer_IdAndOrderid(id, orderId);
    }

    @Override
    public Order addCustomerOrder(Long id, Order order) throws Exception {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null) {
            throw new Exception("Customer is not found.");
        }
        order.setCustomer(customer);
        return orderRepository.save(order);
    }
}
