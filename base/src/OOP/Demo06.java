//构造器知识点,结合Jdy的类来看，二者有联动
package OOP;
//一个类即使什么都不写也会存在一个构造类，
//构造器构造方法在out文件里查看

//构造器要点：必须和类的，名字相同；不能写void
public class Demo06 {
    public static void main(String[] args) {
//实例化一个对象
        //实例化只适用于无参构造
        //Jdy jdy = new Jdy();
        Jdy jdy = new Jdy("hhh");//有参构造，会自动找有参构造，不会管“hhh”
        System.out.println(jdy.name);


        //适用new关键词即“Alt+Enter”本质是在调用构造器，用来初始化值
    }
}
