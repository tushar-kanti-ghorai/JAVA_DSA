package com.Array;

import java.util.Arrays;

public class passingAndFunction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
//        change(arr);
//        System.out.println(Arrays.toString(arr));
        int[] num=change(arr);
        System.out.println(Arrays.toString(num));
    }

//    static void change(int[] a){
//        a[0]=99;
//    }
    static int[] change(int[] a) {
        a[0] = 99;
        return a;
    }
}
