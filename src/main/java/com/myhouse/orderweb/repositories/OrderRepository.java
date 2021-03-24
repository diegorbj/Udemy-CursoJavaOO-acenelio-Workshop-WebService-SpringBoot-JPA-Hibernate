package com.myhouse.orderweb.repositories;

import com.myhouse.orderweb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
