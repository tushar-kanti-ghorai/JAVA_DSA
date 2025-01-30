package com.Polymorphism;



import java.util.*;
class Complex
{
    int real,img;
    Complex()
    {
        real = img = 0;
    }
    Complex(int r, int i)
    {
        real = r;
        img = i;
    }

    Complex(Complex c)
    {
        real = c.real;
        img = c.img;
    }

    void showComplex()
    {
        if(this.img>0)
            System.out.println(this.real+" + "+this.img+"i");
        else
            System.out.println(this.real+" "+this.img+"i");
    }
    Complex addComplex(Complex c1, Complex c2)
    {
        int realsum = c1.real+c2.real;
        int imgsum = c1.img+c2.img;
        Complex temp = new Complex(realsum,imgsum);
        return temp;

    }
    Complex subtractComplex(Complex c1, Complex c2)
    {
        int realdiff = c1.real-c2.real;
        int imgdiff = c1.img-c2.img;
        Complex temp = new Complex(realdiff,imgdiff);
        return temp;

    }

    Complex multiplyComplex(Complex c1, Complex c2)
    {
        int r = c1.real*c2.real - c1.img*c2.img;
        int i = c1.img*c2.real + c2.img*c1.real;
        Complex temp = new Complex(r,i);
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Complex c = new Complex();
        System.out.print("Enter 1st number: ");
        c.real = sc.nextInt();
        c.img = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int r = sc.nextInt();
        int i = sc.nextInt();
        Complex c2 = new Complex(r, i);

        Complex c1 = new Complex(c);

        System.out.println("\nNumbers are ");
        c1.showComplex();
        c2.showComplex();
        Complex c3;
        c3 = c.addComplex(c1,c2);
        System.out.print("\nSum = ");
        c3.showComplex();
        c3 = c.subtractComplex(c1,c2);
        System.out.print("Difference = ");
        c3.showComplex();
        c3 = c.multiplyComplex(c1,c2);
        System.out.print("Multiplication = ");
        c3.showComplex();
    }
}
