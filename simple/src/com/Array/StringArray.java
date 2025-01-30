package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
//Array of objects
        Scanner sc=new Scanner(System.in);
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
           str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));
        str[1]="Tushar";//change the array no 1
        System.out.println(Arrays.toString(str));
    }
}
