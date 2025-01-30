package com.Relationship_Between_object;


class One{
    Two two;
    One(Two two){
        this.two=two;

    }

    double cube(double x){
       double result=x*two.square(x);
        return result;
    }

}
class Two{
    Three three;
    Two(Three three) {
     this.three=three;

    }
    double square(double x){
     double result=x*three.get(x);
     return result;
    }
}

class Three{
  double get(double x){
      return  x;
  }
}

public class Relateobj {
    public static void main(String[] args) {
        Three obj3=new Three();
        Two obj2=new Two(obj3);
        One obj1=new One(obj2);
        double one=obj1.cube(5);
       double two= obj2.square(6);
        System.out.println(one);
        System.out.println(two);


    }
}
