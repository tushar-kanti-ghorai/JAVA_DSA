package com.Method;

public class ReturnWithParameter {
    public static void main(String[] args) {
        Return s=new Return();
        double x=s.sum(10.2,20.2);
        System.out.println(x);



    }
}
        class Return{



//    void sum(){
//        double sum=num1+num2;
//        System.out.println("result:"+sum);
//    }

            double sum(double num1,double num2){
                double res=num1+num2;
                return res;
            }
        }



