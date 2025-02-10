package com.recapProjekt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("1", "Microwave", "X3", 310);
        Product product2 = new Product("2", "E-Scooter", "XM1", 120);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
//        ShopService shopService = new ShopService(productList);
//        shopService.placeOrder("3", 100);
//        shopService.placeOrder("1", 100);
        OrderRepo orderRepo = new OrderMapRepo();
        ShopService shopService = new ShopService(orderRepo);
        Order order1 = new Order("1", "Mike", "Microwave",1,150);
        Order order2 = new Order("2", "Jack", "E-Scooter",1,360);
        Order order3 = new Order("3", "Randol", "TV",2,1200);
        shopService.placeOrder(order1);
        shopService.placeOrder(order2);
        shopService.placeOrder(order3);
        shopService.printAllOrders();
        shopService.cancelOrder(order3);
        shopService.printAllOrders();

    }
}
