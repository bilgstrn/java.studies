package org.example;

public class Main {
    public static void main(String[] args) {
        // Bir öğrencinin sınavdan aldığı puana göre verilen puan

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default: //Yukarıdakilerin dışında bir not girerse
                System.out.println("Geçersiz not girdiniz");
        }
    }
}