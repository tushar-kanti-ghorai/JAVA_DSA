package com.oops_Basic;

import java.util.Scanner;

public class Complex {

    int real, img;
    Complex(){
        real=0;
        img=0;
    }

    Complex(int r,int i){
       this.real=r;
        this.img=i;

    }

    Complex(Complex c){
        real=c.real;
        img=c.img;
    }

    void showComplex(){
        if(img>0){
            System.out.println(real+"+"+img+"i");
        }else{
            System.out.println(real+""+img+"i");

        }

    }


    Complex addComplex(Complex c1){
        int addreal=c1.real+this.real;
        int realadd=c1.img+this.img;
        Complex temp=new Complex(addreal,realadd);
        return temp;
    }

    Complex multiComplex(Complex c1 ){
        int addreal=c1.real*this.real-c1.img*this.img;
        int realadd=c1.img*this.real+this.img*c1.real;
        Complex temp=new Complex(addreal,realadd);
        return temp;
    }

    Complex subComplex(Complex c1){
        int addreal=c1.real-this.real;
        int realadd=c1.img-this.img;
        Complex temp=new Complex(addreal,realadd);
        return temp;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex c=new Complex();
//        c.showComplex();
        System.out.println("Enter the first number:");
        c.real=sc.nextInt();
        c.img=sc.nextInt();
        System.out.println("Enter the second number:");
        int r=sc.nextInt();
        int i=sc.nextInt();

        Complex c2=new Complex(r,i);
        Complex c1=new Complex(c);

        System.out.println("Complex numbers are:");
        c1.showComplex();
        c2.showComplex();
        Complex c3;
        System.out.println("Add Complex");
        c3= c2.addComplex(c1);
        c3.showComplex();

        System.out.println("Sub Complex");
        c3= c2.subComplex(c1);
        c3.showComplex();

        System.out.println("multi Complex");
        c3= c2.multiComplex(c1);
        c3.showComplex();

    }


}
