package com.oops_Basic;

import java.util.Scanner;

public class Fraction {

    int num;
    int denum;
    Fraction(){
        num=0;
        denum=1;
    }

    Fraction(int num){
        this.num=num;
        this.denum=1;
    }

    Fraction(int num,int denum) {
        this.num = num;
        if (denum == 0) {
            System.out.println("Error:Denum can not be zero");
            this.denum = 1;
        } else {
            this.denum = denum;

        }
    }
    Fraction(Fraction f){
        this.num=f.num;
        this.denum=f.denum;
    }


    void show(){
        System.out.println(num+"/"+denum);
    }

    void add(Fraction f1,Fraction f2){
        if(f1.denum==f2.denum){
            System.out.println("Add="+(f1.num+f2.num)+"/"+f1.denum);
            reduce(f1.num+f2.num,f1.denum);
        }else{
            int sum=(f1.num* f2.denum)+(f2.num*f1.denum);
            System.out.println("Add="+sum+"/"+(f1.denum*f2.denum));
            reduce(sum,f1.denum*f2.denum);
        }
    }

    void  sub(Fraction f1,Fraction f2){
        if(f1.denum==f2.denum){
            System.out.println("sub="+(f1.num-f2.num)+"/"+f1.denum);
            reduce(f1.num-f2.num,f1.denum);
        }else{
            int sub=(f1.num* f2.denum)-(f2.num*f1.denum);
            System.out.println("sub="+sub+"/"+(f1.denum*f2.denum));
            reduce(sub,f1.denum*f2.denum);
        }
    }

    void multi(Fraction f1,Fraction f2){
        System.out.println("Mul="+(f1.num* f2.num)+"/"+(f1.denum* f2.denum));
        reduce(f1.num* f2.num,f1.denum* f2.denum);
    }

    void div(Fraction f1,Fraction f2){
        System.out.println("div="+(f1.num*f2.denum)+"/"+(f1.denum*f2.num));
        reduce(f1.num*f2.denum,f1.denum*f2.num);
    }
    void compare(Fraction f1,Fraction f2){
        double f11=(double)f1.num/f1.denum;
        double f12=(double)f2.num/ f2.denum;
        if(f11>f12){
            System.out.println(f1.num+"/"+f1.denum+">"+f2.num+"/"+f2.denum);
        } else if (f11<f12) {
            System.out.println(f1.num+"/"+f1.denum+"<"+f2.num+"/"+f2.denum);

        }else {
            System.out.println(f1.num+"/"+f1.denum+"="+f2.num+"/"+f2.denum);
        }
    }

    void reduce(int num,int denum){
        int i;
        for( i=1;i<=num;i++){
            if(num%i==0 && denum%i==0){
                num=num/i;
                denum=denum/i;
            }
        }
        System.out.println(num+"/"+denum);
        if(num>denum){
            mixed(num,denum);
        }
    }
    void  mixed(int num,int denum){
        int t1=num/denum;
        int t2=num%denum;
        if(t2==0){
            System.out.println("mixed="+t1);
        }else {
            System.out.println("mixed="+t1+" "+t2+"/"+denum);
        }
    }



    public static void main(String[] args) {
        Fraction d=new Fraction();//default;
        Fraction o=new Fraction(2);//one arguments;
        System.out.println("Enter 1st num and denum:");
        Fraction f=new Fraction();
        Scanner sc=new Scanner(System.in);
        f.num=sc.nextInt();
        f.denum=sc.nextInt();

        System.out.println("Enter 2nd num and denum:");
        Fraction ff=new Fraction();
        ff.num= sc.nextInt();;
        ff.denum= sc.nextInt();

        Fraction f1=new Fraction(f);//copy constructor call
        Fraction f2=new Fraction(ff.num,ff.denum);//default constructor call
       int ch;
        do{
            System.out.println("\n\n1.Show\n2.Add\n3.Subtract\n4.Multiply\n5.Divide\n6.Compare\n7.Exit");
             ch= sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("1st num and denum:");
                    f.show();
                    System.out.println("2nd num and denum:");
                    ff.show();
                    break;
                case 2 :
                    f.add(f1,f2);
                    break;
                case 3 :
                    f.sub(f1,f2);
                    break;
                case 4 :
                    f.multi(f1,f2);
                    break;
                case 5 :
                    f.div(f1,f2);
                    break;
                case 6 :
                    f.compare(f1,f2);
                    break;
                case 7 :
                    System.out.println("Terminating...");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while (ch!=7);

    }

}
