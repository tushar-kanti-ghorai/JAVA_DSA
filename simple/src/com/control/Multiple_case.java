package com.control;

import java.util.Scanner;

public class Multiple_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter emp id:");
        int emp_id=sc.nextInt();
        String dept=sc.next();
        switch(emp_id){
            case 1:
                System.out.println("Harry");
                break;
            case 2:
                System.out.println("Tushar");
                switch (dept){
                    case "It":
                        System.out.println("IT department");
                        break;
                    case "Hardware":
                        System.out.println("Hardware department");
                        break;
                    default:
                        System.out.println("no department");
                }
                break;
            default:
                System.out.println("enter incorrect no. of emp_id!!!");
        }
    }
}
