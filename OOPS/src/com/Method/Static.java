package com.Method;


class NotObject{

    static double sum(double num1,double num2){//static method should be declared as static
        double res=num1+num2;
        return res;
    }
}
public class Static {
    public static void main(String[] args) {
        double x=NotObject.sum(10.2,20.2);//className.methodName for call the static method
    }
}
