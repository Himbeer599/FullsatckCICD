package com.recapProjekt;

import java.util.List;

public class ShopService {
//    private List<Product> productList;
//
//    public ShopService(List<Product> productList) {
//        this.productList = productList;
//    }
//
//    public void placeOrder(String productId, int quantity) {
//        Product product = findProductById(productId);
//        if (product == null) {
//            System.out.println("Product with ID " + productId + " does not exist.");
//        } else {
//            System.out.println("Order placed for " + quantity + " of " + product.name() + " at price " + product.price() + " each.");
//        }
//    }
//
//    private Product findProductById(String productId) {
//        for (Product product : productList) {
//            if (product.id().equals((productId))) {
//                return product;
//            }
//        }
//        return null;
//    }
    private final OrderRepo orderRepo;

    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }
    public void placeOrder(Order order){
        if(order != null){
            orderRepo.addOrder(order);
            System.out.println("Order placed successfully: " + order);
        }else{
            System.out.println("Invalid order!");
        }
    }
    public void cancelOrder(Order order){
        boolean removed = orderRepo.removeOrder(order);
        if(removed){
            System.out.println("Order cancelled: " + order.id());
        }else{
            System.out.println("Order not found, cancellation failed: " + order.id());
        }
    }
    public void printAllOrders(){
        System.out.println("\nAll orders in the system:");
        for(Order order:orderRepo.getOrders()){
            System.out.println(order);
        }
    }
}
