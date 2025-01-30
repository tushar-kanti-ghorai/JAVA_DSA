package com.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayName {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a name:");
        String str=br.readLine();

        System.out.println("My name is "+str);

    }
}
