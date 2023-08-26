package OOP.Demo;

//工作人员是人：派生类/子类
//子类继承了父类，就会拥有父类的全部方法
public class Worker extends Person{//extends是扩展的意思，子类是父类的扩展



    public static void main(String[] args) {
        Doctor doctor = new Doctor();//因为Doctor是Person的子类，可以用Person的一些定义
        doctor.say();
        System.out.println(doctor.money);

        doctor.test("hhh");
        doctor.test1();
    }

}
