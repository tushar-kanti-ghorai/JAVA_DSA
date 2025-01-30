package com.Thread;


class S extends Thread{
    public void run() {
        try {


            for (int i = 0; i <= 5; i++) {
                System.out.println("Hii");
                Thread.sleep(1000);


            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

        }
public class SleepMethod {
    public static void main(String[] args)  {

//        for(int i=0;i<=5;i++){
//            System.out.println("Hello");
//            Thread.sleep(2000);
//
//
//        }

          S sh = new S();
          sh.start();

    }
}
