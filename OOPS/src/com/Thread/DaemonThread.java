package com.Thread;


class demo extends Thread{
    public  void run(){
        System.out.println(Thread.currentThread().isDaemon());
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon Thread");
        }else{
            System.out.println("child Thread");
        }

    }

}

public class DaemonThread {
    public static void main(String[] args) {
//        System.out.println("Main thread");
        demo d=new demo();
        d.setDaemon(true);
        d.start();
    }

}
