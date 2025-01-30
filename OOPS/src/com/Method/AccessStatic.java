package com.Method;


class Check{
   static int x=10;

    static  void access(){
        System.out.println("x="+x);
    }



}
public class AccessStatic {
    public static void main(String[] args) {
  Check.access();
    }
}
