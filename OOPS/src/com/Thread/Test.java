package com.Thread;

class D extends Thread{
public void run(){
    System.out.println("thread1");
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().isAlive());
}
}

public class Test {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        System.out.println(10/0);
        Thread.currentThread().setName("Tushar");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        D d=new D();

        System.out.println(d.isAlive());
        System.out.println(d.getName());

        d.setName("Ghorai");
        System.out.println(d.getName());
        //true output
        d.start();
        System.out.println(d.isAlive());





    }

}
