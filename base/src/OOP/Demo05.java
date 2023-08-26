//引用传递：传递的是对象（的地址）；本质还是值传递
package OOP;

public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null,因为没有给name赋值

        Demo05.change(person);
        System.out.println(person.name);
        //姜栋宇，因为person.name修改的是class里的值，相当于c中的传递了地址


    }
    public static void change(Person person){
        //person是一个对象，指向的是--->Person这个类Person person = new Person();
        //这是一个具体的人，可以改变属性。
        person.name = "姜栋宇";
    }


}
//class可以定义好多个，public class只能定义一个
//定义了一个Person类，里面有一个属性：name
class Person{
    String name;
}