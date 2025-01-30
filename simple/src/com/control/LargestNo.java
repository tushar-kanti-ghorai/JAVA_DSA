package com.control;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


////if-else with operator
//        if(a>b && a>c){
//            System.out.println(a+" is the largest number among of the three numbers");
//        }else if(b>a && b>c){
//            System.out.println(b+" is the largest number among of the three numbers ");
//
//        }else{
//            System.out.println(c+" is the largest number among of the three numbers ");
//        }




////only if-else
//        int max=a;
//        if(b>max){
//            max=b;
//            System.out.println(max);
//        }else{
//            max=c;
//            System.out.println(max);
//        }



 ////using math class
 int max=Math.max(c,Math.max(a,b));
 System.out.println(max);
    }
}
