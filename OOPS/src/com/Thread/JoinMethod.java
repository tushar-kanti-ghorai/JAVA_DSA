package com.Thread;

public class JoinMethod extends  Thread {
//    static Thread mainMethod;
    public void run(){
        try {
//            mainMethod.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread:" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//         mainMethod=Thread.currentThread();
        JoinMethod j=new JoinMethod();
        j.start();
        j.join();


        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
