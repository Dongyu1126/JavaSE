//OOP：object—oriented programming面向对象编程
package OOP;
//一个项目应该只存在一个main方法
public class Application {

    public static void main(String[] args) {

        //类：是抽象的，实例化
        //实例化后会返回一个自己的对象
        //xiaoming对象就是一个Students类的具体实例
        Students xiaoming = new Students();
        Students xiaohong = new Students();

        xiaoming.name = "小明";
        xiaoming.age = 10;


        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);
    }
}
