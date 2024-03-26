package org.example;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();  // sistemi oracle'a çektim . istersem sql'e de çekebilirim
        customerManager.getCustomers();
    }
}