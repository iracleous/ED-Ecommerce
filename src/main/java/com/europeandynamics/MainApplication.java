package com.europeandynamics;


import com.europeandynamics.business.ProductManagement;
import com.europeandynamics.data.ProductRepository;
import com.europeandynamics.model.Product;

public class MainApplication {



    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        System.out.println(productRepository.getProduct());

    //    ProductManagement productManagement = new ProductManagement();
//        for(Product product: productRepository.getProduct())
//        {
//            productManagement.updatePrice(product,10,100, 1, 10, 100 );
//        }

        productRepository.getProduct().forEach( product ->
                ProductManagement.updatePrice(product,10,100, 1, 10, 100 ) );


        System.out.println(productRepository.getProduct());

    }

}
