package com.Some_Concept;

public class depends_reference {
    public static void main(String[] args) {
 sub_depends p=new sub_depends();//when do not override method
        p.seek();
        p.feek();
    }

}

class Parent_depends{
     void feek(){
        System.out.println("hii main");

    }
}


class sub_depends extends Parent_depends {
    void seek() {
        System.out.println("hii Tushar");
    }
}
