package com.fortunato.java_api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("ingredient")
public class IngredientModel {
    @Id
    private String id;
    private FoodModel food;
    private String name;
    private int preparationTime;
    private List<IngredientModel> ingredients;
    private List<String> steps;

    public IngredientModel() { }
}
