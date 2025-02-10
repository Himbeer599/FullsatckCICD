package com.recapProjekt;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private List<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }

    public OrderListRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Order getOrderById(String id) {
        for (Order order : orders) {
            if (order.id().equals(id)) {
                return order;
            }
        }
        return null;
    }
}
