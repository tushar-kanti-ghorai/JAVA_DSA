package com.oops_Basic;

class A {
    int a;
    String b;

    A(){
     a=10;
    b="Tushar";
        System.out.println(a);
        System.out.println(b);
    }

    A(A ref){
        a= ref.a;;
        b=ref.b;
        System.out.println(a);
        System.out.println(b);
    }
}


public class CopyCons {

    public static void main(String[] args) {
        A r=new A();
        A r1=new A();
    }
}
