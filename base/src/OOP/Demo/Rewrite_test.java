package OOP.Demo;

public class Rewrite_test {
    public static void main(String[] args) {

        Rewrite1 a = new Rewrite1();
        a.test();//走的是Rewrite1

        //父类的指引指向了子类
        Rewrite2 b = new Rewrite1();
        b.test();//走的是Rewrite2

        /*
        静态方法是类的方法，而非静态方法是对象的方法
        有static时，b调用了Rewrite2类的方法，因为b是由Rewrite2类定义的
        没有static时，b调用的是对象的方法，而b的Rewrite1这个对象类new出来的
        即b是Rewrite1 new出来的对象，因此调用了Rewrite1的方法
         */


    }
}
