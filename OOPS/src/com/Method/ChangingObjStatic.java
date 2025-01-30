package com.Method;

class StaticM{
    static int x=10;
    static void display() {
        System.out.println(x);
    }


}



public class ChangingObjStatic {
    public static void main(String[] args) {
        StaticM obj1=new StaticM();
        StaticM obj2=new StaticM();
        ++obj1.x;
        System.out.println("x in obj1");
        obj1.display();
        System.out.println("x in obj2");
        obj2.display();

    }
}
