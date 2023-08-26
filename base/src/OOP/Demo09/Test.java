package OOP.Demo09;
//测试内外部类
public class Test {
    public static void main(String[] args) {

        Outer outer = new Outer();
        //通过这个外部类实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();

        //匿名：没有名字初始化类
        new Apple().eat();

        new UserService(){

            @Override
            public void hello() {

            }
        };


    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
    }


interface UserService{
    void hello();
}