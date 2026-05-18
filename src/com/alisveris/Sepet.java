<<<<<<< HEAD
package com.alisveris;
import java.util.ArrayList;

public class Sepet{
    ArrayList<Urun> urunler = new ArrayList<>();

    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
    
    public double toplamTutar(){
        double toplam=0;

        for(Urun u : urunler){
            toplam += u.fiyat;
        }
        return toplam;
    }
}
=======
package com.alisveris;
import java.util.ArrayList;

public class Sepet{
    ArrayList<Urun> urunler = new ArrayList<>();

    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
    
    public double toplamTutar(){
        double toplam=0;

        for(Urun u : urunler){
            toplam += u.fiyat;
        }
        return toplam;
    }
}
>>>>>>> 23f474712c0e2a5bd66099d7780498d562ec0d6c
