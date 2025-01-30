package com.first_program;

class Class1{
    public static void main(String[] args) {
        for(String s:args){
            System.out.println(s);
        }
    }

}

 class Class2 {
    public static void main(String[] args) {
        String names[]={"Tushar","Anirban","Sourav","Dip","Tomo"};
        Class1.main(names);
    }
}
