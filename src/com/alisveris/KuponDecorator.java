<<<<<<< HEAD
package com.alisveris;

public class KuponDecorator extends SepetDecorator{
    public KuponDecorator(SepetArayuz sepet){
        super(sepet);
    }

    public double tutarHesapla(){
        return sepet.tutarHesapla()-50;
    }
=======
package com.alisveris;

public class KuponDecorator extends SepetDecorator{
    public KuponDecorator(SepetArayuz sepet){
        super(sepet);
    }

    public double tutarHesapla(){
        return sepet.tutarHesapla()-50;
    }
>>>>>>> 23f474712c0e2a5bd66099d7780498d562ec0d6c
}