package com.control;

public class ForEach {
    public static void main(String[] args) {
//        syntax
//                for(var:collection){
//                    statements
//                }

        int[] arr={10,20,30,40,50};
        int count=0;
        for(int i:arr){
            System.out.println(i);
            count++;
        }
        System.out.println("In for each loop ,The number of iteration is :"+count);
    }
}
