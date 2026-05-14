package com.alisveris;

public class YILBASIIndirim implements Indirim{

    @Override
    public double IndirimUygula(double tutar){
        return tutar * 0.80;
    }
}
