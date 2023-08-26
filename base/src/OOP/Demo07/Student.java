package OOP.Demo07;
//static
public class Student {

    private static int age;//静态变量
    private double score;//非静态变量

    public void run(){

    }
    public static void go(){

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);
        //System.out.println(Student.score);报错，因为非静态变量和类不同时加载
        System.out.println(s1.score);
        System.out.println(s1.age);

        Student.go();
    }
}
