package org.example;

public class Main {
    public static void main(String[] args) {

        // Parametreli constructor
        Product product = new Product(1 , "Laptop" , "Asus Laptop" , 5000 , 3 , "mavi");

        /* Parametresiz constructor
        product.set_name("Laptop");
        product.set_id(1);
        product.set_description("Asus Laptop");
        product.set_price(5000);
        product.set_stockAmount(3); */
        //Constructor kullandığım zaman bu şekilde uzun uzun yazmama gerek yok.

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_kod());
        // Bir class sadece bir iş yapar . Bir metot sadece bir iş yapar.
    }
}