package com.Thread;

class P extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class Priorities {
    public static void main(String[] args) {
        System.out.println("Before:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("After:"+Thread.currentThread().getPriority());
        P ph=new P();
        ph.setPriority(5);
        ph.start();

    }
}
