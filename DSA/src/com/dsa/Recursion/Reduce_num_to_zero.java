package com.dsa.Recursion;

public class Reduce_num_to_zero {
    public static void main(String[] args) {
        System.out.println(reduce(14));
    }

    static int reduce(int n){
        return to_zero(n,0);
    }

    static int to_zero(int n,int s){
        if(n==0){
            return s;
        }
        if(n%2==0){
            return to_zero(n/2,s+1);
        }
        return to_zero(n-1,s+1);
    }

}
