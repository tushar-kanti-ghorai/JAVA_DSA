package com.Method;

class Test{
    int x=10;
    void display(){
        System.out.println(x);
    }
}

public class EffectObjectInst {
    public static void main(String[] args) {
        Test obj1,obj2;
        obj1=new Test();
        obj2=new Test();
        //increment the x variable of the value in obj1
        ++obj1.x;
        System.out.println("x in obj1");
        obj1.display();
        System.out.println("x in obj2");
        obj2.display();
    }
}
