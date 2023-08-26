//形参和实参
package OOP;

public class Demo03 {
    public static void main(String[] args) {
        int add = Demo03.add(1, 2);//实参
        System.out.println(add);

    }
    public static int add(int a,int b){//a和b为形参
        return a+b;
    }
}
