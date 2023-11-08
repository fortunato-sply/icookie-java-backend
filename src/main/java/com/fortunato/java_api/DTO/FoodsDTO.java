package com.fortunato.java_api.DTO;

import java.util.List;

import com.fortunato.java_api.model.FoodModel;

import lombok.Data;

@Data
public class FoodsDTO {
    private List<FoodModel> list;
}
