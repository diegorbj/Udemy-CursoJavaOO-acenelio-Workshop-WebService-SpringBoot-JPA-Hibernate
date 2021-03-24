package com.myhouse.orderweb.services;

import com.myhouse.orderweb.entities.Order;
import com.myhouse.orderweb.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository _repository;

    public List<Order> findAll() {
        return _repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = _repository.findById(id);
        return obj.get();
    }

}
