package com.alisveris;

public class BildirimObserver implements SepetObserver{
    public void guncelle(String mesaj){
        
    	System.out.println("BİLDİRİM: " + mesaj);
    }
}