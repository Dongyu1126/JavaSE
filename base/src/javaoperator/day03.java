package javaoperator;

public class day03 {
    public static void main(String[] args) {
        char c1='a';
        char c2='中';
        //int c3=(int)c1;
        int c3=c1+c2;//由低到高不需要强制转换
        char c4='\u0061';//unicode转义了
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
