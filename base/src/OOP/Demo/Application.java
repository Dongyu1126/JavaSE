package OOP.Demo;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();

        //获取值
        student.setName("dongyu");
        //得到值
        System.out.println(student.getName());

        int id = student.getId();
        id = 370687;
        System.out.println(id);

        student.setAge(24);
        System.out.println(student.getAge());





    }
}
