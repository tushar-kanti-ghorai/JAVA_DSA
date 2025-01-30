package com.control;

public class Continue {
    public static void main(String[] args) {
        int i,j;
        j=1;
        while(j<=3){
            System.out.print(j);
            for(i=1;i<=5;i++){
                System.out.println("\t"+i);
                if(i==3) break;
            }
            j++;
        }
    }


}
