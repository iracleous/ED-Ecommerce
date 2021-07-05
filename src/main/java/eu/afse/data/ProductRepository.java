package eu.afse.data;

import eu.afse.model.Color;
import eu.afse.model.ImportedProduct;
import eu.afse.model.Product;

import java.util.ArrayList;

public class ProductRepository {

    private static final String NAME = "dress";
    private static final double PRICE = 25;
    private static final String DESCRIPTION = "very nice";
    private static final Color COLOR = Color.RED;
    private static final int SIZE = 25;
    private static final String MATERIAL = "cotton";


    private ArrayList<Product> products= new ArrayList<>();

    public   ProductRepository(){

        Product product = new Product(NAME, PRICE, DESCRIPTION, COLOR, SIZE, MATERIAL);
        System.out.println("product = " + product );


        product.updatePrice(5,10, 1,
                2,3);
        System.out.println("product = " + product );

        Product product2 = new Product("zz", 12, DESCRIPTION, COLOR, SIZE, MATERIAL);
        Product product3 = new Product("yy", 30, DESCRIPTION, COLOR, SIZE, MATERIAL);

        ImportedProduct importedProduct = new ImportedProduct("ccy", 3, DESCRIPTION, COLOR, SIZE, MATERIAL, "China");


    }


    public ArrayList<Product> getProducts() {
        return products;
    }



}
