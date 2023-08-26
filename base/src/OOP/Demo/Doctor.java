package OOP.Demo;
//医生也是人：子类/派生类
public class Doctor extends Person {
    private String name = "dongyu";

    public Doctor() {//隐藏了代码super();默认调用了父类的无参构造
        //super();
        System.out.println("子类无参执行了");

    }

    public void print(){
        System.out.println("儿子");
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);//this.name是类本身的name，即使private依然可以用
        System.out.println(super.name);//super.name是父类person中的
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }
}
