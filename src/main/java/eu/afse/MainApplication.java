package eu.afse;

import eu.afse.model.*;

import java.util.Date;
import java.util.Scanner;

public class MainApplication {

    private static final String NAME = "dress";
    private static final double PRICE = 25;
    private static final String DESCRIPTION = "very nice";
    private static final Color COLOR = Color.RED;
    private static final int SIZE = 25;
    private static final String MATERIAL = "cotton";



    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give your name ");
//        String name = scanner.nextLine();
//        System.out.println("Your name is " + name);
//
//        //primitive types
//        boolean myValue = true;
//        char aChar = 's';
//        char anotherChar = 33;
//        byte aByte = -128;
//        short shortNumber = 32767;
//        int anInt = -2147483648;
//        long longNumber = 12345669999L;
//        float number = 3.15F;
//        float floatScientific = 1.345f-12;
//        double highPrecision = 12.67;
//        double high = 1.345e-12;
//       double oneBillion = 1e9;
//       double oneBillion2 = 1000000000.0;
//
//       //class types
//        // wrapper class
//        Boolean b = myValue;
//        Double oneBillionObject = oneBillion;
//
//        // explicit casting
//        shortNumber = (short) anInt  ;




        Product product = new Product(NAME, PRICE, DESCRIPTION, COLOR, SIZE, MATERIAL);
        System.out.println("product = " + product );


        product.updatePrice(5,10, 1,
                2,3);
        System.out.println("product = " + product );

        Product product2 = new Product("zz", 12, DESCRIPTION, COLOR, SIZE, MATERIAL);
        Product product3 = new Product("yy", 30, DESCRIPTION, COLOR, SIZE, MATERIAL);

        ImportedProduct importedProduct = new ImportedProduct("ccy", 3, DESCRIPTION, COLOR, SIZE, MATERIAL, "China");


        Customer customer = new Customer(7, "George", "Staras", "Athina","1234567", "staras@gmail.com");

        Order order = new Order();

        order.setCustomer(customer);

        order.setId("C1234");
        order.setOrderDate( new Date(121,6,5));

        System.out.println(order.getOrderDate());
        order.create(product);
        order.create(product2);
        order.create(product3);
        order.create(importedProduct);

        System.out.println(order);
        System.out.println("Total order cost = " + order.calculateTotal());

        System.out.println("-----------------------------------");
        System.out.println(order.read(-2));
        System.out.println(order.read(3));
        if (order.read(4)!=null)
        System.out.println(order.read(4));

        ///////////////////////////

        ProductIndex productIndex = new ProductIndex();
        productIndex.addProductToMap("a1", product);
        productIndex.addProductToMap("a2", product2);
        productIndex.addProductToMap("a3", product3);
        productIndex.addProductToMap("a4", importedProduct);
        productIndex.addProductToMap("a5", product3);
        productIndex.addProductToMap("a2", product3);

        System.out.println(productIndex);

    }

}
