package com.alisveris;

public class KargoDecorator extends SepetDecorator{
    public KargoDecorator(SepetArayuz sepet){
        super(sepet);
    }

    public double tutarHesapla(){
        return sepet.tutarHesapla()+20;
    }
}