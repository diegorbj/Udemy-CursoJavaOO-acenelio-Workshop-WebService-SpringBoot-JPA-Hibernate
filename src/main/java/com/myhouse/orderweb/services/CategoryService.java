package com.myhouse.orderweb.services;

import com.myhouse.orderweb.entities.Category;
import com.myhouse.orderweb.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository _repository;

    public List<Category> findAll() {
        return _repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = _repository.findById(id);
        return obj.get();
    }

}
