package com.InputOutput;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception{
        FileOutputStream f=new FileOutputStream("D:\\xyz.txt");
        BufferedOutputStream br=new BufferedOutputStream(f);
        String s="Tushar johny";
        int x=0;
         char[] arr=s.toCharArray();
         while (x<s.length()){
             br.write(arr[x++]);
         }
         br.close();


    }
}
