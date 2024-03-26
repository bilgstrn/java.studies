package org.example;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomers() {
        databaseManager.getData();   //Kullanırken hangi veri tabanını çağırırsam onu kullanırım .
    }
}
