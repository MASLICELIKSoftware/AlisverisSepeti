package com.alisveris;

public class KuponDecorator extends SepetDecorator{
    public KuponDecorator(SepetArayuz sepet){
        super(sepet);
    }

    public double tutarHesapla(){
        return sepet.tutarHesapla()-50;
    }
}