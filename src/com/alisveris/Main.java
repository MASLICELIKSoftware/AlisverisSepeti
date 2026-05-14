package com.alisveris;

public class Main{
    public static void main(String[] args){

        SepetArayuz sepet = new TemelSepet(500);

        sepet = new KuponDecorator(sepet);
        sepet = new KargoDecorator(sepet);

        OdemeSistemi odeme = new OdemeSistemi();

        odeme.satinAl(sepet);
    }
}