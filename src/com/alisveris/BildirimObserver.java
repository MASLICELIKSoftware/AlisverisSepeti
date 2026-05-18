package com.alisveris;

public class BildirimObserver implements SepetObserver{
    
	@Override
    public void guncelle(String mesaj){
        System.out.println("BİLDİRİM: " + mesaj);
    }
}