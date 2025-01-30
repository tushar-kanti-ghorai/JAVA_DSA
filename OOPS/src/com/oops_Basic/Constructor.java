package com.oops_Basic;



class Person {
   private String name;
    private int age;

    //default constructor
    Person() {
        name = "Tushar";
        age = 22;
    }

    //parameterized constructor
    Person(String s, int i) {
        name = s;
        age = i;
    }

    void talk() {
        System.out.println("Hello i am " + name);
        System.out.println("My age is " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Person Tushar=new Person();
        Tushar.talk();

        Person Ram=new Person("Ram",24);

//        Person Ram=new Person();
        Ram.talk();

    }
}
