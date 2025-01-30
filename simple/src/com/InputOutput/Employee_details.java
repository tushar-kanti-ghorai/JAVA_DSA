package com.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee_details {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter id:");
        int id=Integer.parseInt(br.readLine());
        System.out.print("Enter sex:");
        char ch=br.readLine().charAt(0);
        System.out.print("Enter name:");
        String name=br.readLine();

        System.out.println("Employee id="+id);
        System.out.println("Employee sex="+ch);
        System.out.println("Employee name="+name);


    }
}
