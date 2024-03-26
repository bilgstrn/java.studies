package org.example;

public class Main {
    public static void main(String[] args) {
        String harf = "E";

        switch (harf) {
            case "A":
            case "I":
            case "U":
            case "O":
                System.out.println("Kalın Sesli Harfdir!");
                break;
            default:
                System.out.println("İnce Sesli Harfdir!");
        }
    }
}