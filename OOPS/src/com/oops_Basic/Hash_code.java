package com.oops_Basic;
import java.lang.*;

 class Man{
   private String name="Raju";
    private int age=30;

    void talk() {
        System.out.println("Hello I am " + name);
        System.out.println("My age is " + age);
    }
}

public class Hash_code {
    public static void main(String[] args) {

        Man tushar = new Man();
        tushar.talk();

//        tushar.name="Tushar";//you can't initialize the instance variable after the method calling;
//        tushar.age=21;

     Man ram=new Man();
        ram.talk();
        System.out.println("Hash code = " + tushar.hashCode());
        System.out.println("hashcode of ram:" +ram.hashCode());
    }
}
