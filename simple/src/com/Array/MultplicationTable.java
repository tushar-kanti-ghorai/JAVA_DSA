package com.Array;

public class MultplicationTable {
    public static void main(String[] args) {
        int[] mul=Mul(2);
        for(int sol:mul){
            System.out.println(sol);
        }
    }

    static int[] Mul(int num){
        int[] results=new int[11];
        for(int i=0;i<=10;i++){
            results[i]=i*num;

        }
        return results;
    }


}
