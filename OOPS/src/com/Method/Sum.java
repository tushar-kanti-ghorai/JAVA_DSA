package com.Method;


class Sample{
    private double num1;
    private double num2;
    Sample(double x,double y){
        num1=x;
        num2=y;
    }

//    void sum(){
//        double sum=num1+num2;
//        System.out.println("result:"+sum);
//    }

   double sum(){
        double sum=num1+num2;
        return sum;
    }
}
public class Sum {
    public static void main(String[] args) {

        Sample s=new Sample(10.2,20.2);
        //s.sum();
        double x=s.sum();
        System.out.println("Sum="+x);

    }
}
