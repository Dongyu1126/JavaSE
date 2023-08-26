package javaoperator;

public class Day05 {
    public static void main(String[] args) {
        int a=100;
        long b=1222L;
        double c=46;
        short d=8;
        int e=46;
        int f=8;

        System.out.println(a+b);
        System.out.println(b+c);
        System.out.println(c+d);
        System.out.println(a/c);
        System.out.println(a%c);
        System.out.println("--------------------------");
        System.out.println(a/e);
        System.out.println(a%e);
        System.out.println(a/(double)e);
        System.out.println((double) a/e);
        System.out.println((double)(a/e));
    }
}
