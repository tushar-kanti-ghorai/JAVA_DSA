package com.Method;


class Instance{
    int x=10;
    void display(){
        System.out.println(x);
    }
}
public class ChangingObjinst {
    public static void main(String[] args){
        Instance obj1=new Instance();
        Instance obj2=new Instance();
        ++obj1.x;
        System.out.println("x in obj1");
        obj1.display();
        System.out.println("x in obj2");
        obj2.display();


    }
}
