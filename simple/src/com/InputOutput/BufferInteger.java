package com.InputOutput;

import java.io.*;

public class BufferInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a integer number:");
        int a=Integer.parseInt(br.readLine());


        System.out.println("The integer number is:"+a);
        

    }
}
