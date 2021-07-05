package eu.afse.model;

import java.util.HashMap;
import java.util.Map;

public class ProductIndex {

    private final Map<String, Product> productMap;

    public ProductIndex() {
        productMap = new HashMap<>();
    }


    //add element
    public void addProductToMap(String productName, Product product) {
        productMap.put(productName, product);
    }

    //remove
    public void removeProductFromMap(String productName) {
        if (productMap.containsKey(productName))
        productMap.remove(productName);
    }

    //find
    public Product findProductInMap(String productName){
        if (productMap.containsKey(productName))
            return productMap.get(productName);
        return null;
    }



    //list = toString
    @Override
    public String toString(){


        return productMap.toString();
    }


}
