package com.sangvaleap.lab5.repository;

import com.sangvaleap.lab5.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findOrdersByCustomer_Id(Long id);

    Order findOrderByCustomer_IdAndOrderid(Long id, Long orderId);

}
