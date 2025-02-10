package com.recapProjekt;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private List<Product> products;

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void addProducts(Product product){
        products.add(product);
    }
    public void removeProducts(Product product){
        products.remove(product);
    }
    public Product getProduct(String id){
        for(Product product:products){
            if(product.id() == id){
                return product;
            }
        }
        return null;
    }
}
