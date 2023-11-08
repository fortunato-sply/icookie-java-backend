package com.fortunato.java_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fortunato.java_api.DTO.FoodsDTO;
import com.fortunato.java_api.model.FoodModel;
import com.fortunato.java_api.services.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService service;

    @GetMapping("")
    public List<FoodModel> getAll() {
        return service.findAll();
    }

    @PostMapping("")
    public void newFood(@RequestBody FoodModel newFood) {
        service.save(newFood);
    }

    @PostMapping("/many")
    public List<FoodModel> newFood(@RequestBody FoodsDTO newFoods) {
        List<FoodModel> foods = newFoods.getList();
        return service.saveMany(foods);
    }
}
