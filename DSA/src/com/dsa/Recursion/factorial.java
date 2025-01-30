package com.dsa.Recursion;

public class factorial {
    public static void main(String[] args) {
        int ans=fact(5);
        int ans1=sum(5);
        System.out.println("factorial is:"+ans);
        System.out.println("sum of number:"+ans1);

    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }

    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

}
