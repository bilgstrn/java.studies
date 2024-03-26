package org.example;

public class Main {
    public static void main(String[] args) {
        // interface'lerde abstractlar gibi new'lenemezler.

        ICustomerDal customerDal = new MySqlCustomerDal(); // ama bu şekilde istediğim class'ı çağırabilirim.

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal()); // ne gönderirsem o çalışacak.
        customerManager.add();
    }
}