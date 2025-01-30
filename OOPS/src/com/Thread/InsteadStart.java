package com.Thread;

public class InsteadStart extends Thread {
    public void run(){

        try {
            for(int i=1;i<=5;i++){
                System.out.println(i+"-"+Thread.currentThread().getName());
               Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InsteadStart i=new InsteadStart();
        i.run();
        InsteadStart i2=new InsteadStart();
        i2.run();
    }

}
