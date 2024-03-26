package org.example;

public class Main {
    public static void main(String[] args) {
        //void : bir şeyi yap!
        //String olan bir değeri void olan bir operasyona atayamam.

        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);
        //Substring bir değer return eder döndürür.

        System.out.println("----------------");

        String yeniMesaj2 = sehirVer();
        System.out.println(yeniMesaj2);

        System.out.println("----------------");

        int sayi = topla(15, 35);
        System.out.println(sayi);
        //Buraya hangi değerleri verirsem onları toplayıp ekrana yazar.

        System.out.println("----------------");

        int toplam = topla2(3, 4, 5, 5, 55, 5, 566, 6, 7);
        System.out.println(toplam);
        //İstediğim kadar sayı verebilirim.
    }

    public static void ekle() {
        System.out.println("Eklendi");

    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }//Bu fonksiyon int türünde bir değer döndürür demektir. Yukarıda int olarak çağırırım.

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Karaman";
    }//Burası da string bir değer döndürür. Yukarıda string olarak çağırırım .
}