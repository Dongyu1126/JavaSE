//值传递和引用传递
package OOP;
//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(a);//1

        Demo04 demo04 = new Demo04();
        demo04.change(a);
        System.out.println(a);//1,因为java是值传递，a还是6

    }

    public  static int change(int a){//此返回值为空
        a = 10;
        return a;
    }
}
