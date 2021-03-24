package com.myhouse.orderweb.repositories;

import com.myhouse.orderweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
