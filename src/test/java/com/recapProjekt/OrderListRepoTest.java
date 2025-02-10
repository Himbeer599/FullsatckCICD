package com.recapProjekt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderListRepoTest {

    private OrderListRepo orderListRepo = new OrderListRepo();

    @Test
    void addOrder() {
        Product product1 = new Product("1", "Hauselectronics", 1200);
        Order order = new Order("1", "Mike", "TV", 2, product1);
        orderListRepo.addOrder(order);
        List<Order> orders = orderListRepo.getOrders();
        assertTrue(orders.contains(order),"This order should be included");
        assertEquals(1,orders.size(),"The size should be 1");
    }

    @Test
    void removeOrder() {
        Product product1 = new Product("1", "Hauselectronics", 1200);
        Order order = new Order("1", "Mike", "TV", 2, product1);
        orderListRepo.addOrder(order);
        orderListRepo.removeOrder(order);
        List<Order> orders = new ArrayList<>();
        assertFalse(orders.contains(order),"It should not be included");
    }

    @Test
    void getOrderById() {
        Product product1 = new Product("1", "Hauselectronics", 1200);
        Order order = new Order("1", "Mike", "TV", 2, product1);
        orderListRepo.addOrder(order);
        Order expectedorder = orderListRepo.getOrderById("1");
        assertEquals(expectedorder,order);
    }
}