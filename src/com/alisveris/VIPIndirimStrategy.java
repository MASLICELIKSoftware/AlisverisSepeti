package com.alisveris;

public class VIPIndirimStrategy implements IndirimStrategy{

    @Override
    public double indirimHesapla(double tutar){
        
    	return tutar * 0.80;
    }
}
