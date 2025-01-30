package com.control;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res=0;
        while (true) {
            System.out.print("Enter the operator:");
            //take the operator as input
            char op = sc.next().trim().charAt(0);//trim method  removes the whitespace
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the two numbers:");
                //take the user input of two numbers from the keyboard
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (op == '+') {
                    res = num1 + num2;
                }
                if (op == '-') {
                    res = num1 - num2;
                }
                if (op == '*') {
                    res = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        res = num1 / num2;
                    }

                }
                if (op == '%') {
                    res = num1 % num2;
                }
            } else if (op=='E' || op=='e') {
                System.out.println("Stop process!");
                break;

            }else{
                System.out.println("Invalid operation!!!");
            }


            System.out.println(res);//output



        }


    }
}
