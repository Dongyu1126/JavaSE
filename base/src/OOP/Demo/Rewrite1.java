package OOP.Demo;
//子类
public class Rewrite1 extends Rewrite2{


    //Override 重写：只有非静态方法才能被重写，静态方法不行
    @Override//注解：有功能的注释！
    public void test() {
        //子类重写了父类的方法，执行子类的方法
        System.out.println("Rewrite1=>test()");
    }
}

