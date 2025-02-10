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
        ShopService shopService = new ShopService(productList);
        shopService.placeOrder("3", 100);
        shopService.placeOrder("1", 100);


    }
}
