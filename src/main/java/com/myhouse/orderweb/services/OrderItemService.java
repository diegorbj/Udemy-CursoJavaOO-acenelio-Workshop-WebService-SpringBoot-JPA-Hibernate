package com.myhouse.orderweb.services;

import com.myhouse.orderweb.entities.OrderItem;
import com.myhouse.orderweb.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository _repository;

    public List<OrderItem> findAll() {
        return _repository.findAll();
    }

    public OrderItem findById(Long id) {
        Optional<OrderItem> obj = _repository.findById(id);
        return obj.get();
    }
}
