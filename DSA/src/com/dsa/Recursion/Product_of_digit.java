package com.dsa.Recursion;

public class Product_of_digit {
    public static void main(String[] args) {
        int ans=pod(1342);
        System.out.println(ans);
    }

    static int pod(int n){
        if((n%10)==n) {
            return n;
        }
        return pod(n/10)*(n%10);
    }
}
