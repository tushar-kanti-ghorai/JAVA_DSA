package com.Function_Method;

public class NotChange {
    public static void main(String[] args) {
        String name="Tushar";
        notChange(name);
        System.out.println(name);
    }

    static  void  notChange(String naam){
        naam="Ghorai";//Creating a new object
    }
}
