package com.europeandynamics.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    //fields
    private String name;
    private double price;
    private String description;
    private Color color;
    private int size;
    private String material;

}


