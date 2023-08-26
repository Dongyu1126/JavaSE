//继承知识点
package OOP.Demo;

import sun.security.rsa.RSAUtil;

//Person 人：父类/基类
public class Person {
    public Person() {
        System.out.println("父类无参执行了");
    }

    /*
    几个修饰符
    public；protected;default;private
    公共---逐渐到-->私有
     */

    protected String name = "xiangyu";
    public void print(){
        System.out.println("爸爸");
    }

    public int money = 10_0000_0000;
    public void say(){
        System.out.println("说了一句话");
    }
//Ctrl+H可以查看类的继承情况
// 根据继承情况，我们发现Java中所有类都直接或间接继承了Object类
}
