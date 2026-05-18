package com.alisveris;

public class OgrenciIndirimSrategy implements IndirimStrategy{

    @Override
    public double indirimHesapla(double tutar){
        
    	return tutar * 0.90;
    }
}
