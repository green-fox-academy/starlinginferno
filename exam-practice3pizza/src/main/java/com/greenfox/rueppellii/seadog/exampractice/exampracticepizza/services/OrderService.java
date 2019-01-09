package com.greenfox.rueppellii.seadog.exampractice.exampracticepizza.services;

import com.greenfox.rueppellii.seadog.exampractice.exampracticepizza.models.PizzaOrder;
import com.greenfox.rueppellii.seadog.exampractice.exampracticepizza.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addNewOrder(PizzaOrder pizzaOrder) {
        orderRepository.save(pizzaOrder);
    }

    public PizzaOrder showOrder(Long id) {
        return orderRepository.findById(id).get();
    }

    public List<Object> find3MostPopular() {
        return orderRepository.showTop3();
    }
}
