package com.Method;


class Hample{
    int x;
    Hample(){
        this(55);
        this.access();
    }
    Hample(int x){
        this.x=x;
    }


//    int Modify(int x) {
//        x = x;
//        return x;
//    }
    void access(){
        System.out.println(x);

    }
}

public class This_key {
    public static void main(String[] args) {
        Hample s=new Hample();
//        s.Modify(10);
//        s.access();
    }

}
