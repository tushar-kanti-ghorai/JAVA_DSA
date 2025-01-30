package com.InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DisplayChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //break above syntax:
        //InputStreamReader obj=new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(obj);
        System.out.print("Enter a character:");
        char ch=(char)br.read();

        System.out.println(ch);

    }
}
