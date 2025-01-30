package com.Method;

class Employee{
    int id1;
    int id2;
    Employee(int id1,int id2){
        this.id1=id1;
        this.id2=id2;
    }
}

class Checki {
    void swap(Employee obj) {
       int temp;
        temp=obj.id1;
        obj.id1=obj.id2;
        obj.id2=temp;
        System.out.println("swap");
        System.out.println(obj.id1);
        System.out.println(obj.id2);


    }
}

public class PassingObj {
    public static void main(String[] args) {
//        Employee obj1=new Employee(10);
//        Employee obj2=new Employee(20);
//       Checki obj=new Checki();
//       obj.swap(obj1,obj2);
//        System.out.println(obj1.id+" "+obj2.id);
        Employee obj=new Employee(10,20);
        Checki obj1=new Checki();
        obj1.swap(obj);
        System.out.println(obj.id1+" "+obj.id2);
    }
}
