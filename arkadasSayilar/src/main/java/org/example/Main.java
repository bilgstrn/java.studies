package org.example;

public class Main {
    public static void main(String[] args) {
        //220-284 bilinen en küçük iki arkadaş sayı
        //kendileri hariç pozitif tam bölenlerinin toplamı birbirine eşit olan sayılara arkadaş sayı denir.

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }

        if (sayi1 == toplam2 && sayi2 == toplam1) {   //and operatörüdür . iki koşulunda true olması lazım.
            System.out.println("Bu iki sayı arkadaştır!");
        } else {
            System.out.println("Bu iki sayı arkadaş değildir");
        }
    }
}