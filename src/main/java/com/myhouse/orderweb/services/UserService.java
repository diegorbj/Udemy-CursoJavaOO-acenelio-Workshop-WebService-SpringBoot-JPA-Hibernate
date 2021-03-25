package com.myhouse.orderweb.services;

import com.myhouse.orderweb.entities.User;
import com.myhouse.orderweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository _repository;

    public List<User> findAll() {
        return _repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = _repository.findById(id);
        return obj.get();
    }

    public User insert(User obj) {
        return _repository.save(obj);
    }

    public void delete(Long id) {
        _repository.deleteById(id);
    }
}
