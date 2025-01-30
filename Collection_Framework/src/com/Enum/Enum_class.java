package com.Enum;

public class Enum_class  {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
       Week(){
           System.out.println(this);
       }

       @Override
        public void hello(){
           System.out.println("Hii");
       }

    }

    public static void main(String[] args) {
        Week week;
        week=Week.Tuesday;
        System.out.println(week);
        for(Week day:Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());
        System.out.println(Week.valueOf("Saturday"));
       week.hello();

    }
}
