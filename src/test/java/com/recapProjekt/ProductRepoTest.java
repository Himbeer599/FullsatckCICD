package com.recapProjekt;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {
    ProductRepo productRepo = new ProductRepo();

    @Test
    void expectedtrue_addproduct() {

        Product product = new Product("1","Laptop",1200);
        productRepo.addProducts(product);
        List<Product> products = productRepo.getProducts();
        assertTrue(products.contains(product),"Product should be in the list");
        assertEquals(1,products.size(),"Product list size should be 1");
    }

    @Test
    void removeProducts() {
    }

    @Test
    void getProduct() {
    }
}