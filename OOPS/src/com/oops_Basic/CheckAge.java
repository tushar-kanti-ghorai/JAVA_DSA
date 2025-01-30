package com.oops_Basic;
//import java .io.*;

class Age {
    private String name;
    private int age;

    Age(String s,int i){
        name=s;
        age=i;
    }

//   public void accept() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter a name:");
//        name = br.readLine();
//        System.out.print("Enter an age:");
//        age = Integer.parseInt(br.readLine());
//    }

    public void check() {
        if (age <= 30) {
            System.out.println("So, " + name + " is young whose age is less than 30");
        } else if (age <= 50) {
            System.out.println("So, " + name + " is middle-aged ");
        } else {
            System.out.println(name + " is old");
        }
    }
}

public class CheckAge {
//    public static void main(String[] args) throws IOException {
//        Age a = new Age();
//        a.accept();
//        a.check();
//    }
public static void main(String[] args) {//This is run only in command prompt
    String s=args[0];
    int i=Integer.parseInt(args[1]);

  Age p=new Age(s,i);
    p.check();

}
}
