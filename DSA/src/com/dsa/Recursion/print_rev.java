package com.dsa.Recursion;

import static com.dsa.Recursion.Print_num.print;

public class print_rev {
    public static void main(String[] args) {
        pr(5);
    }
    static void pr(int n){
        if(n==1){

            System.out.println(n);
            return;
        }
        pr(n-1);
        System.out.println(n);
    }
//    static void pr(int n){
//        pr_4(4);
//        System.out.println(n);
//    }
//
//
//static void pr_4(int n){
//    pr_3(3);
//    System.out.println(n);
//}
//static void pr_3(int n){
//    pr_2(2);
//    System.out.println(n);
//
//}
//
//    static void pr_2(int n){
//
//    }
}


