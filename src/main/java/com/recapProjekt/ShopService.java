package com.recapProjekt;

import java.util.List;

public class ShopService {
    private List<Product> productList;

    public ShopService(List<Product> productList) {
        this.productList = productList;
    }

    public void placeOrder(String productId, int quantity) {
        Product product = findProductById(productId);
        if (product == null) {
            System.out.println("Product with ID " + productId + " does not exist.");
        } else {
            System.out.println("Order placed for " + quantity + " of " + product.name() + " at price " + product.price() + " each.");
        }
    }

    private Product findProductById(String productId) {
        for (Product product : productList) {
            if (product.id().equals((productId))) {
                return product;
            }
        }
        return null;
    }
}
