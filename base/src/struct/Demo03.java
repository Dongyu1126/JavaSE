package struct;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入考试分数：");
        int score = scanner.nextInt();
        if(score>=60&score<70){
            System.out.println("D");

        }else if(score>=70&score<80){
            System.out.println("C");
        }else if(score>=80&score<90){
            System.out.println("B");
        }else if(score>=90&score<=100) {
            System.out.println("A");
        }else {
            System.out.println("成绩不及格");
        }



        scanner.close();
    }
}
