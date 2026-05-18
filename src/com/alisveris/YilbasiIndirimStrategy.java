package com.alisveris;

public class YilbasiIndirimStrategy implements IndirimStrategy{

    @Override
    public double indirimHesapla(double tutar){
        
    	return tutar * 0.85;
    }
}
