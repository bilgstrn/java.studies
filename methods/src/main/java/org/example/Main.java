package org.example;

public class Main {
    public static void main(String[] args) {
    //Burada da aşağıda oluşturduğum metodumu çağırdım.
    //Eğer çağırmazsak methodumu göremem. Çünkü javada önce main metodu çalışır. İstediğim kadar çağırabilirim.
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    //Fonksiyon yazarak kodu tekrarlamayı engellemiş oluyoruz .
    //İsimlendirme yapılırken camelCase kullanılır.

    public static void sayiBulmaca() {        //sayı bulmaca diye method oluşturdum
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer(aranacak);
        } else {
            System.out.println("Sayı mevcut değildir");
        }

    }

    public static void mesajVer(int aranacak) {    //parametreli method
        System.out.println("Sayı mevcuttur");
    }
}