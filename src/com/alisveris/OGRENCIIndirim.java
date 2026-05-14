package com.alisveris;

public class OGRENCIIndirim implements Indirim{

    @Override
    public double IndirimUygula(double tutar){
        return tutar * 0.90;
    }
}