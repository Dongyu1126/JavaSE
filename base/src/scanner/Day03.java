package scanner;

import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //从键盘接收数据
/*
        int i = 0;
        float f = 0.0f;不要了，麻烦
 */

        System.out.println("请输入整数：");
        //如果。。。那么
        if(scanner.hasNextInt()==true){
            int i = scanner.nextInt();
            System.out.println("整数数据："+i);
        }else{
            System.out.println("输入的不是整数数据！");
        }

        System.out.println("请输入小数：");
        //如果。。。那么
        if(scanner.hasNextFloat()){
            float f = scanner.nextFloat();
            System.out.println("小数数据："+f);
        }else{
            System.out.println("输入的不是小数数据！");
        }




        scanner.close();

    }
}
