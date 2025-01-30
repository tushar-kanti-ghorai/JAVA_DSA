package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

 public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(67);
        list.add(55);
        list.add(99);
        list.add(100);
        System.out.println(list);
        list.set(1,88);
        System.out.println(list);
       list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(544));
//

//
//        for(int i=0;i<5;i++){
//            list.add(in.nextInt());
//        }
//
//        for(int i=0;i<5;i++){
//            System.out.print(list.get(i)+" ");//pass index here,list[index] syntax will not work here
//        }
        System.out.println();
        System.out.println(list);

    }
}
