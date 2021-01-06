package com.mimi.FoodDelivery.repositories;

import com.mimi.FoodDelivery.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza,Long> {

}
