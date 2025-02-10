package com.recapProjekt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderMapRepo implements OrderRepo{

    private Map<String,Order> orderMap;

    public OrderMapRepo() {
        this.orderMap = new HashMap<>();
    }

    @Override
    public void addOrder(Order order){
        orderMap.put(order.id(), order);
        System.out.println("Order added: " + order);
    };
    @Override
    public boolean removeOrder(Order order){
        if(orderMap.containsKey(order.id())){
            orderMap.remove(order);
            System.out.println("Order removed with ID: " + order.id());
            return true;
        }
        System.out.println("Order ID not found: " + order.id());
        return false;
    };

    @Override
    public Order getOrderById(String id){
        return orderMap.get(id);
    };

    @Override
    public List<Order> getOrders(){
        return orderMap.values().stream()
                .collect(Collectors.toList());
    };
}
