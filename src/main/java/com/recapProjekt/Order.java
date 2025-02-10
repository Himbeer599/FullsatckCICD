package com.recapProjekt;

public record Order(String id, String username, String productname, int count, Product product) {
    public Order (String id, String username, String productname, int count, Product product) {
        this.id = id;
        this.username = username;
        this.productname = productname;
        this.count = count;
        this.product = product;
    }
    public double totalPrice (){
        return count*product.price();
    }
}
