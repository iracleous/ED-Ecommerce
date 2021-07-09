package com.europeandynamics.business;

import com.europeandynamics.model.Product;

public class ProductManagement {



    /**
     * Business rule 5.67
     * T 4.31
     * 2021-07-01
     *
     * 0- limitA -> priceIncrease1
     * limita - limit B -> priceIncrease2
     * above -> priceIncrease3
     * @author Dimitris Iracleous
     */
    public static void updatePrice(Product product, double priceLimitA, double priceLimitB,
                            double priceIncrease1, double priceIncrease2, double priceIncrease3) {
        if (product.getPrice() < priceLimitA)
            product.setPrice( product.getPrice() + priceIncrease1);
        else if (product.getPrice() < priceLimitB)
            product.setPrice( product.getPrice() + priceIncrease2);
        else
            product.setPrice( product.getPrice() + priceIncrease3);
    }



    /**
     * T 4.32
     * change descriptions according to size
     */
    public static void updateDescription(Product product) {
        if (product.getSize() <= 5) {
            product.setDescription(  product.getDescription()+ " Size=SMALL" );
        } else if (product.getSize() <= 10) {
            product.setDescription(  product.getDescription()+ " Size=MEDIUM" );

        } else {
            product.setDescription(  product.getDescription()+ " Size=LARGE" );

        }
    }

    /**
     * T4.33
     * change prices according to color
     */
    public static void updatePriceByColor(Product product) {
        switch (product.getColor()) {
            case BLACK:
                break;
            case RED:
            case BROWN:
                product.setPrice( product.getPrice() + 10);
                break;
            default:
                product.setPrice( product.getPrice() -2);
        }
    }





}
