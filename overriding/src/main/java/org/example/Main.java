package org.example;

public class Main {
    public static void main(String[] args) {
        // overriding => üzerine yazmak
        // OgretmenKrediManager OgretmenKrediManager = new OgretmenKrediManager();
        // System.out.println(ogretmenKrediManager.hesapla(1000));
        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgrenciKrediManager(), new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}