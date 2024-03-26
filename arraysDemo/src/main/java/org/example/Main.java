package org.example;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Bilge";
        String ogrenci2 = "Aykut";
        String ogrenci3 = "Elanur";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------------------------------------------");

        // Yukarıdaki gibi tek tek yazmak zor olacağı için dizileri kullanırım

        String[] ogrenciler = new String[6]; //ne kadar değer vereceğimi buraya yazarım
        ogrenciler[0] = "Bilge";
        ogrenciler[1] = "Aykut";
        ogrenciler[2] = "Elanur";
        ogrenciler[3] = "Sinan";
        ogrenciler[4] = "Kardelen";
        ogrenciler[5] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------------------------------------");

        // Yukarıdaki for döngüsünü aşağıdaki gibi de yazabiliriz

        for (String ogrenci : ogrenciler) {  //ogrenciler içerisindeki her bir elemanı gez demektir. ogrenci yazdığım yerde takma isimdir . her hangi bir şey verebilirim . fark etmez .
            System.out.println(ogrenci);
        }
    }
}