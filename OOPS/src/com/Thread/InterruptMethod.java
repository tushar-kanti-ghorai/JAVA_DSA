package com.Thread;

public class InterruptMethod extends Thread {
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InterruptMethod i=new InterruptMethod();
        System.out.println(i.isAlive());
        i.start();
        i.interrupt();

    }

}
