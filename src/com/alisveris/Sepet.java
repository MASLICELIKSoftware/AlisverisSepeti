package com.alisveris;
import java.util.ArrayList;
import java.util.List;

public class Sepet{
    ArrayList<Urun> urunler = new ArrayList<>();
    
    private IndirimStrategy indirimStrategy;

    public void setIndirimStrategy(IndirimStrategy indirimStrategy){
        this.indirimStrategy = indirimStrategy;
    }

    private List<SepetObserver> observerlar = new ArrayList<>();

    public void observerEkle(SepetObserver observer){
        observerlar.add(observer);
    }

    public void bilgilendir(String mesaj){
        for(SepetObserver o : observerlar){
            o.guncelle(mesaj);
        }
    }

    public void urunEkle(Urun urun){
    	urunler.add(urun);
        bilgilendir("Ürün eklendi: " + urun.ad);
    }

    public double toplamTutar(){
        double toplam = 0;

        for(Urun u : urunler){
            toplam += u.fiyat;
        }
        return toplam;
    }
    
    public double indirimliToplam(){
        double toplam = toplamTutar();

        if(indirimStrategy!=null){
            toplam = indirimStrategy.indirimHesapla(toplam);
        }
        return toplam;
    }
}
