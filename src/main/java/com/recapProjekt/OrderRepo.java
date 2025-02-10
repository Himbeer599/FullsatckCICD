package com.recapProjekt;

import java.util.List;

public interface OrderRepo {

    void addOrder(Order order);

    boolean removeOrder(Order order);

    Order getOrderById(String id);
    List<Order> getOrders();
}
