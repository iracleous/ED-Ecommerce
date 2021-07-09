package com.europeandynamics;


import com.europeandynamics.data.ProductRepository;

public class MainApplication {



    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        System.out.println(productRepository.getProduct());

    }

}
