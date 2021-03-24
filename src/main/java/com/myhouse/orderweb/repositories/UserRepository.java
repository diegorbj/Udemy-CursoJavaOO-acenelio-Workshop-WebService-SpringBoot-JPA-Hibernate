package com.myhouse.orderweb.repositories;

import com.myhouse.orderweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
