package com.Exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadandWrite{
    void  read() throws FileNotFoundException {
        FileInputStream fs=new FileInputStream("d/abc.txt");
    }

    void save() throws FileNotFoundException{
        String name="Tushar";
        FileOutputStream fs=new FileOutputStream("d:/xyz.txt");
    }

}
public class ThrowsExcep {
    public static void main(String[] args) throws FileNotFoundException {
        ReadandWrite r=new ReadandWrite();
          try {
              r.read();
          }catch (Exception e){
              System.out.println(e);
          }


            try {
                r.save();
            }catch (Exception e){
                System.out.println(e);
            }

        System.out.println("hii");

    }
}
