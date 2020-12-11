package c.enums;

public class OverTimeManager2 {
    public static void main(String[] args) {
        OverTimeValues2 value = OverTimeValues2.THREE_HOUR;
        System.out.println(value);
        System.out.println(value.getAmount());
        System.out.println(value.ordinal());

        OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR;
        System.out.println(value.compareTo(value2));
    }
}
