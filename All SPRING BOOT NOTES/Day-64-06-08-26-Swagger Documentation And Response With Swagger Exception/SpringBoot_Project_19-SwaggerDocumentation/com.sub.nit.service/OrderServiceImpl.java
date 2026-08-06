package com.sub.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Order;
import com.sub.nit.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Integer id) {
        Optional<Order> optional = orderRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Order updateOrder(Integer id, Order order) {

        Optional<Order> optional = orderRepository.findById(id);

        if (optional.isPresent()) {
            order.setId(id);
            return orderRepository.save(order);
        }

        return null;
    }

    @Override
    public String deleteOrder(Integer id) {

        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return "Order Deleted Successfully...";
        }

        return "Order Not Found...";
    }
}
