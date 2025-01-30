package com.String;

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {
        Random random=new Random();
        System.out.println(random.nextFloat());
        int n=20;
        System.out.println(genarate(n));

    }
    static String genarate(int size){
        StringBuffer sb=new StringBuffer(size);
        Random random=new Random();
        for(int i=0;i<26;i++) {
            int string = (97 + (int) (random.nextFloat() * 26));
            sb.append((char)string);
        }

        return sb.toString();

    }
}
