package com.recapProjekt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    private ShopService shopService;
    private OrderRepo orderRepo;
    @BeforeEach
    void setUp(){
        //use Imp of orderRepo interface to create an instance
        orderRepo = new OrderMapRepo();
        shopService = new ShopService(orderRepo);
    }
    @Test
    void placeOrder() {
        Product product1 = new Product("1", "Hauselectronics", 1200);
        Order order1 = new Order("1", "Mike", "TV", 2, product1);
        shopService.placeOrder(order1);
        assertTrue(orderRepo.getOrders().contains(order1),"This order should be included");
    }

    @Test
    void cancelOrder() {
        Product product1 = new Product("1", "Hauselectronics", 1200);
        Order order1 = new Order("1", "Mike", "TV", 2, product1);
        shopService.placeOrder(order1);
        shopService.cancelOrder(order1);
        assertFalse(orderRepo.getOrders().contains(order1),"It should not exist");
    }

    @Test
    void printAllOrders() {
        Product product1 = new Product("1", "Hauselectronics", 1200);
        Order order1 = new Order("1", "Mike", "TV", 2, product1);
        Order order2 = new Order("2", "Hike", "Laptop", 2, product1);
        shopService.placeOrder(order1);
        shopService.placeOrder(order2);
        shopService.printAllOrders();
    }
}