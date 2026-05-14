package com.alisveris;

public class TemelSepet implements SepetArayuz{
    private double tutar;

    public TemelSepet(double tutar){
        this.tutar = tutar;
    }
    
    public double tutarHesapla(){
        return tutar;
    }
}