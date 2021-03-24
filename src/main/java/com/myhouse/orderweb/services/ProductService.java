package com.myhouse.orderweb.services;

import com.myhouse.orderweb.entities.Product;
import com.myhouse.orderweb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository _repository;

    public List<Product> findAll() {
        return _repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = _repository.findById(id);
        return obj.get();
    }

}
