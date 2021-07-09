package com.europeandynamics.data;


import com.europeandynamics.model.Product;

import java.util.ArrayList;


public class ProductRepository {

    private final ArrayList<Product> products = new ArrayList<>();



    public void addProduct(Product product){
        products.add(product);
    }

    public Product getProduct(int index){
        if (index>=0 && index<products.size())
        return  products.get(index);
        return null;
    }


    public void deleteProduct(int index){
        if (index>=0 && index<products.size())
            products.remove(index);
    }

    public ArrayList<Product> getProduct(){
        return products;
    }




    // calculate total
    public double calculateTotal() {
        double calculation = 0;
//        for (int index = 0 ; index < products.size(); index ++){
//            calculation += products.get(index).getPrice();
//        }

        for (Product product : products) {
            calculation += product.getPrice();
        }

//      calculation = products.stream().map(product ->product.getPrice())
//              .reduce( (value1, value2) -> value1+value2).get();

        return calculation;
    }

    public int countProducts(){
        return products.size();
    }





}
