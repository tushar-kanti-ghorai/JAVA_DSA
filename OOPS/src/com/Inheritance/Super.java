package com.Inheritance;


class A{
    int a=10;
    A(int b){
        System.out.println(b);
    }

    void show(){
        System.out.println("hi a");
    }
}

class B extends A{
    int a=20;
    B(){
        super(100);
        System.out.println("hello");
    }

    void show(){
        super.show();
        System.out.println(a);
        System.out.println(super.a);
        System.out.println("hii b");
    }
}

public class Super {
    public static void main(String[] args) {
        B r=new B();r.show();
    }


}
