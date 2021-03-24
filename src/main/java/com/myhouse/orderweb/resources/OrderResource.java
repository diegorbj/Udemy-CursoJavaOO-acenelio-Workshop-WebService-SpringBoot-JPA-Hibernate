package com.myhouse.orderweb.resources;

import com.myhouse.orderweb.entities.Order;
import com.myhouse.orderweb.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService _service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = _service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = _service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
