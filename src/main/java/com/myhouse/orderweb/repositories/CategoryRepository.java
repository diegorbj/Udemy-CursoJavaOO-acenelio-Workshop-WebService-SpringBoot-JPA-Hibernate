package com.myhouse.orderweb.repositories;

import com.myhouse.orderweb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
