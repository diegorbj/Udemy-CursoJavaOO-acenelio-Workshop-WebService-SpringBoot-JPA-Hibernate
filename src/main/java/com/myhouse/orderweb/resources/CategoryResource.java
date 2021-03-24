package com.myhouse.orderweb.resources;

import com.myhouse.orderweb.entities.Category;
import com.myhouse.orderweb.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService _service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = _service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = _service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
