<<<<<<< HEAD
package com.alisveris;

public class KargoDecorator extends SepetDecorator{
    public KargoDecorator(SepetArayuz sepet){
        super(sepet);
    }

    public double tutarHesapla(){
        return sepet.tutarHesapla()+20;
    }
=======
package com.alisveris;

public class KargoDecorator extends SepetDecorator{
    public KargoDecorator(SepetArayuz sepet){
        super(sepet);
    }

    public double tutarHesapla(){
        return sepet.tutarHesapla()+20;
    }
>>>>>>> 23f474712c0e2a5bd66099d7780498d562ec0d6c
}