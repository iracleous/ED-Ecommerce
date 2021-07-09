package com.europeandynamics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor


public class Order {
    private Date orderDate;
    private String id;
    private String shipment;
    private final List<Product> products = new ArrayList<>();
    private Customer customer;




}
