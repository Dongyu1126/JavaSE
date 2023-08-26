//方法的调用：递归
//这和Student是联动的
package OOP;

public class Demo02 {
    public static void main(String[] args) {
        //静态方法 static
        //静态方法可以通过：Student.say();即可调用，即类名+“.”+方法名
        //非静态方法不可直接调用，需要实例化这个Student类来调用
        Student student = new Student();
        //对象类型 对象名 = 对象值;
        student.say();
    }
}
