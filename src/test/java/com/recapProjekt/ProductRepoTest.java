package com.recapProjekt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    void expectedfalse_removeproduct() {
        Product product = new Product("1","Laptop",1200);
        productRepo.removeProducts(product);
        List<Product> products = productRepo.getProducts();
        assertFalse(products.contains(product),"Product should not be in the list");

    }

    @Test
    void getProduct() {
        Product product = new Product("1","Laptop",1200);
        productRepo.addProducts(product);
        Product exptected = productRepo.getProduct("1");
        assertEquals(exptected,product);
        Product notexisted = productRepo.getProduct("45");
        assertNull(notexisted,"Product should not be found");
    }

//    public Product getProduct(String id){
//        for(Product product:products){
//            if(product.id() == id){
//                return product;
//            }
//        }
//        return null;
//    }
}