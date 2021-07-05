package eu.afse.service;

import eu.afse.model.Order;

public class Reporting {



    public double getTotal(Order order){
        return order.calculateTotal();
    }


}
