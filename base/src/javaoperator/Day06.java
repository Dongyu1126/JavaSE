package javaoperator;

public class Day06 {
    public static void main(String[] args) {

        int money=20_0000_0000;
        long money2=20_0000_0000L;
        long money3=10_0000_0000;
        int year=10;
        int total=money*year;
        long total2=money*year;
        long total3=(long)money*year;
        long total4=money2*year;
        long total5=money3*year;
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);
        System.out.println(total5);
    }
}
