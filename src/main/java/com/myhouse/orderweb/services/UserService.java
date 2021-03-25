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

    public User update(Long id, User obj) {
        User entity = _repository.getOne(id);
        //User entity = findById(id);
        updateData(obj, entity);
        return _repository.save(entity);
    }

    private void updateData(User from, User to) {
        to.setName(from.getName());
        to.setEmail(from.getEmail());
        to.setPhone(from.getPhone());
    }

}
