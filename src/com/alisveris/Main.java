<<<<<<< HEAD
package com.alisveris;

public class Main{
    public static void main(String[] args){

        SepetArayuz sepet = new TemelSepet(500);

        sepet = new KuponDecorator(sepet);
        sepet = new KargoDecorator(sepet);

        OdemeSistemi odeme = new OdemeSistemi();

        odeme.satinAl(sepet);
    }
=======
package com.alisveris;

public class Main{
    public static void main(String[] args){

        SepetArayuz sepet = new TemelSepet(500);

        sepet = new KuponDecorator(sepet);
        sepet = new KargoDecorator(sepet);

        OdemeSistemi odeme = new OdemeSistemi();

        odeme.satinAl(sepet);
    }
>>>>>>> 23f474712c0e2a5bd66099d7780498d562ec0d6c
}