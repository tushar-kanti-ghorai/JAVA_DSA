package com.Relationship_Between_object;


import java.util.Scanner;

class BankAcc{
    double bal;
    BankAcc(double b){
        bal=b;
    }

    void contact(double r){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter password:");
        String password=sc.nextLine();
        if(password.equals("xyz123")){
            Interest in=new Interest(r);
            in.calculateInt();
        }else {
            System.out.println("wrong password");
        }

    }

    private class Interest{
        double rate;
        Interest(double r){
            rate=r;
        }
        void calculateInt(){
            double interest=bal*rate/100;
            bal+=interest;
            System.out.println(bal);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        BankAcc b=new BankAcc(1000);
        b.contact(9.5);

    }
}
