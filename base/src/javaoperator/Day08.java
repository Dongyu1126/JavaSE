package javaoperator;

public class Day08 {
    //逻辑运算符
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;


        System.out.println("a&&b:"+(a&&b));//与
        System.out.println("a||b:"+(a||b));//或
        System.out.println("!(a&&b):"+!(a&&b));//非
        System.out.println("__________________");

        //短路实验
        int c=5;
        boolean d=(c<4)&&(c++<4);/*为假的时候直接结束，因为必为假，所以c++不会被执行
        所以c结果仍然为5*/
        System.out.println(c);
        System.out.println(d);

    }
}
