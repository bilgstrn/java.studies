package org.example;

public class ProductManager {
    public void Add(Product product) {
        //JDBC
        System.out.println("Ürün eklendi: " + product.get_name());
    }
}