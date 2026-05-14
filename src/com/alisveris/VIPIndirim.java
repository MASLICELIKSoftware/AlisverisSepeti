package com.alisveris;

public class VIPIndirim implements Indirim{

    @Override
    public double IndirimUygula(double tutar){
        return tutar * 0.75;
    }
}