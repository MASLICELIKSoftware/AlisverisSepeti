package com.alisveris;

public abstract class SepetDecorator implements SepetArayuz{
    protected SepetArayuz sepet;

    public SepetDecorator(SepetArayuz sepet){
        this.sepet = sepet;
    }
}
