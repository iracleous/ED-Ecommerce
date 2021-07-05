package eu.afse;

import eu.afse.data.ProductRepository;
import eu.afse.model.*;

import java.util.Date;
import java.util.Scanner;

public class MainApplication {



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


        ProductRepository productRepository = new ProductRepository();


        Customer customer = new Customer(7, "George", "Staras", "Athina","1234567", "staras@gmail.com");

        Order order = new Order();

        order.setCustomer(customer);

        order.setId("C1234");
        order.setOrderDate( new Date(121,6,5));

        System.out.println(order.getOrderDate());
        order.create(productRepository.getProducts().get(0));
        order.create(productRepository.getProducts().get(1));
        order.create(productRepository.getProducts().get(2));
        order.create(productRepository.getProducts().get(3));

        System.out.println(order);
        System.out.println("Total order cost = " + order.calculateTotal());

        System.out.println("-----------------------------------");
        System.out.println(order.read(-2));
        System.out.println(order.read(3));
        if (order.read(4)!=null)
        System.out.println(order.read(4));

        ///////////////////////////

        ProductIndex productIndex = new ProductIndex();
        productIndex.addProductToMap("a1", productRepository.getProducts().get(0));
        productIndex.addProductToMap("a2", productRepository.getProducts().get(1));
        productIndex.addProductToMap("a3", productRepository.getProducts().get(2));
        productIndex.addProductToMap("a4", productRepository.getProducts().get(3));
        productIndex.addProductToMap("a5", productRepository.getProducts().get(0));
        productIndex.addProductToMap("a2", productRepository.getProducts().get(1));

        System.out.println(productIndex);

    }

}
