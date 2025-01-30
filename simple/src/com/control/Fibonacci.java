package com.control;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        System.out.print(a);
        int b=1;
        System.out.print("\t"+b);
//        int c;
        int count =2;
        while(count<=n){
            int temp=b;
            //c=a+b;
            b=a+b;
            System.out.print("\t"+b);
            a=temp;
            //a=b;
            //b=c;
            count++;
        }
    }
}
