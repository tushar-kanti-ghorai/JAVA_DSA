package com.Method;


class Ref {
    int x;
}
class Change{
    void swap(Ref r1,Ref r2){

        Ref temp;
        temp=r1;
        r1=r2;
        r2=temp;

        System.out.println("swap");
        System.out.println(r1.x);
        System.out.println(r2.x);

    }

}
public class PassingRef {
    public static void main(String[] args) {
        Ref r1 = new Ref();
        Ref r2 = new Ref();
        r1.x=10;
        r2.x=11;
        System.out.println("Before swapping");
        System.out.println(r1.x);
        System.out.println(r2.x);
        Change c=new Change();
        c.swap(r1,r2);
        System.out.println("After swapping");
        System.out.println(r1.x);
        System.out.println(r2.x);


    }
}
