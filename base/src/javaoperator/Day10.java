package javaoperator;

public class Day10 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=1;
        a+=b;//a=a+b
        c-=b;//c=c-b

        System.out.println(a);
        System.out.println(c);
        System.out.println("__________________________________");
        //字符串连接符
        System.out.println(""+a+b);//前面有字符串a与b相连
        System.out.println("jdy"+a+b);
        System.out.println(a+b+" ");//字符串在后面，前面的a与b正常相加
        System.out.println(a+b+"jdy");

    }
}
