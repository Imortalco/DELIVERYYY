package com.mimi.FoodDelivery.repositories;

import com.mimi.FoodDelivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
