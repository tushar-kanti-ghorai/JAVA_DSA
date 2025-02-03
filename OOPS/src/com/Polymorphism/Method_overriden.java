package com.Polymorphism;

class Puper{
    void show(){
        System.out.println("Puper ");
    }
}

class pub extends Puper{
    void show(){
//        super.show();
        System.out.println("Sub");
    }
}
public class Method_overriden {
    public static void main(String[] args) {
        Puper s=new pub();//It  depends on the object type as here method override occurs

        s.show();//only sub got
        s.show();//only sub got when not use super keyword for call the parent class as a Puper
    }
}
