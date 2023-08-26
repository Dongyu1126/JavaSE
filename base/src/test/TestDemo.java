package test;
//打印三角形，5行
public class TestDemo {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){//这个默认是行输出
            for (int j = 5; j >= i ; j--) {
                 System.out.print("A");//print代表一行可以输出多个值
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");//这个for是在上面的for的基础上继续变化的
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print("$");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("A");
            }
            System.out.println();//换行,即每进行一个i就换一行

        }

    }
}
