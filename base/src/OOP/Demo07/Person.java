package OOP.Demo07;

public class Person {
    //2.第二个执行，在构造方法之前，可以被用来赋初值
    {
        //代码（匿名代码块）
        System.out.println("匿名代码块");
    }
    //1.最早执行跟类一起加载
    static {
        //静态代码块，只执行一次
        System.out.println("静态代码块");
    }
    //3.
    public Person(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("========================");
        Person p2 = new Person();
    }
}
