package com.Thread;

public class YieldMethod extends Thread{

    public void run(){

        for (int i=0;i<=5;i++){
            System.out.println(i+"-"+Thread.currentThread().getName());
        }

    }
public static void main(String[] args) {
        YieldMethod y=new YieldMethod();
        y.start();
    Thread.yield();
    for (int i=0;i<=5;i++){
        System.out.println(i+"-"+Thread.currentThread().getName());
    }

}
}
