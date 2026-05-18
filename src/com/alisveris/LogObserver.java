package com.alisveris;

public class LogObserver implements SepetObserver{
    public void guncelle(String mesaj){
        
    	System.out.println("LOG: " + mesaj);
    }
}
