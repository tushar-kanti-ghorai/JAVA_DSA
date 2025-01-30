package com.Polymorphism;

class Puper{
    void show(){
        System.out.println("Puper ");
    }
}

class pub extends Puper{
    void sho(){
//        super.show();
        System.out.println("Sub");
    }
}
public class Method_overriden {
    public static void main(String[] args) {
        pub s=new pub();
        s.show();
        s.sho();
    }
}
