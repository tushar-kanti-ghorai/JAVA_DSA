package com.control;

public class count {
    public static void main(String[] args) {
        int num=1255655;
        //hom many fives here
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==5){
                count++;
            }
            num=num/10;

        }
        System.out.println(count);
    }
}
