package com.alisveris;

public class LogObserver implements SepetObserver{
   
	@Override
    public void guncelle(String mesaj){
        
		System.out.println("LOG: " + mesaj);
    }
}