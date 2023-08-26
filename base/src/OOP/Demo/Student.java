//封装的知识点:属性私有，get/set
//封装要求：高内聚，低耦合。类似于银行类的内部数据操纵细节自己完成，不允许外部干涉，仅暴露少量的方法给外部使用
package OOP.Demo;

public class Student {

    //名字
    private String name;//私有属性不能被调用
    //学号
    private int id;
    //性别
    private char sex;
    //年龄
    private int age;

    //提供一些public的方法get/set，来获得这些私有数据。
    //get 获取这个数值
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    //set 给数据设置值
    public void setName(String name){
        this.name = name;
    }

    //Fn+Alt+Enter可以自动生成get和set算法
    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>120||age<0){
            this.age = 3;
        }else{
            this.age = age;
        }

    }
}
