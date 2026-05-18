package com.alisveris;

public class Main{
    public static void main(String[] args){

    	
        Sepet sepet = new Sepet();

        sepet.observerEkle(new LogObserver());
        sepet.observerEkle(new BildirimObserver());

        sepet.urunEkle(new Urun("Telefon", 1000));
        sepet.urunEkle(new Urun("Laptop", 2000));

        System.out.println("Toplam: " + sepet.toplamTutar());


        
        Sepet sepet2 = new Sepet();

        sepet2.urunEkle(new Urun("Telefon", 1000));
        sepet2.urunEkle(new Urun("Laptop", 2000));

        sepet2.setIndirimStrategy(new OgrenciIndirimSrategy());
        System.out.println("Öğrenci İndirimi: " + sepet2.indirimliToplam());

        sepet2.setIndirimStrategy(new VIPIndirimStrategy());
        System.out.println("VIP İndirimi: " + sepet2.indirimliToplam());
    }
}