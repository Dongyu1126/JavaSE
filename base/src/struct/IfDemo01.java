package struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个内容：");
        String s = scanner.nextLine();

        if (s.equals("H ello")){//equals是用来判断字符串是否相等，==不是判断字符串是否相等
            System.out.println("hello");
        }
            System.out.println("End");



        scanner.close();
    }
}
