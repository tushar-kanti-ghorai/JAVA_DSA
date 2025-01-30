package com.LinkedList;

import jdk.jfr.Experimental;

public class Singlell_main {
    public static void main(String[] args) {
        SingleLL list=new SingleLL();
        list.display();
        list.insertLast(30);
        list.insertLast(40);
        list.insertfirst(20);
        list.display();
        list.insert(10,0);
        list.insert(50,4);
        list.insert(100,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        System.out.println(list.delete(1));
        list.display();

    }
}
