package javaoperator;

public class Day07 {
    public static void main(String[] args) {
        int a=3;
        int b=a++;
        //a++ a=a+1
        int m=2;
        int n=3;
        int u=++m+n++;
        System.out.println(m);
        System.out.println(n);
        System.out.println(u);

        System.out.println("__________________________________");
        System.out.println(a);
        int c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("____________________________________________");
        //幂运算 2^3   2*2*2=8
        double pow = Math.pow(2, 3);

        System.out.println(pow);



    }
}
