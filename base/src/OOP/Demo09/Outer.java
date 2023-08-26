//多种内部类
package OOP.Demo09;

public class Outer {

    //局部内部类
    public void method(){
        class partInner{
            public void in(){
            }
        }
    }

    private int ou = 100;
    public void out(){
        System.out.println("这是一个外部类的方法");
    }

    class Inner{
        public void in(){
            System.out.println("这是一个内部类的方法");
        }
        //获取外部类的私有属性
        public void getID(){
            System.out.println(ou);
        }
    }

}
