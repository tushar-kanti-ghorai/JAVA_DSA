
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enum_example {
    public static void main(String[] args) {
        // Using enum constantsk
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
    }
}
