package org.example;

public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int aranacak = 10;
        boolean varMi = false;
        //Aranacak olan sayı, sayıların içerisinde var mı yok mu ?
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayı mevcuttur!");
        } else {
            System.out.println("Sayı mevcut değildir!");
        }


    }
}