package com.europeandynamics.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

    private int id;
    private String name;
    private String surname;
    private String address;
    private String tel;
    private String email;


}

