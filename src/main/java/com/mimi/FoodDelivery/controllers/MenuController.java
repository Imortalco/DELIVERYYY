package com.mimi.FoodDelivery.controllers;


import com.mimi.FoodDelivery.entities.*;
import com.mimi.FoodDelivery.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/menu")
public class MenuController {

    private final BurgerRepository burgerRepository;
    private CityRepository cityRepository;
    private DealsRepository dealsRepository;
    private final DessertRepository dessertRepository;
    private DrinkRepository drinkRepository;
    private final PizzaRepository pizzaRepository;
    private SaladRepository saladRepository;
    private SauceRepository sauceRepository;
    private DistrictRepository districtRepository;

    MenuController(PizzaRepository pizzaRepository,
                   DessertRepository dessertRepository,
                   BurgerRepository burgerRepository) {
        this.burgerRepository= burgerRepository;
        this.pizzaRepository = pizzaRepository;
        this.dessertRepository = dessertRepository;
    }

    @GetMapping("/text")
    public ResponseEntity<?> Text() {
        Map<String, String> response = new HashMap<>();
        response.put("purvi string", "vtroi string");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
     public List<Pizza> getPizza() {
        return pizzaRepository.findAll();
    }

    @GetMapping("/burger")
    public Optional<Burger> getBurgerByName(String name) {
        return burgerRepository.findByName(name.toLowerCase());
    }

    @GetMapping("/search/id")
    public Optional<Pizza> getPizzaById(@RequestParam(required = false) Long id){
        return pizzaRepository.findById(id);
    }
}
