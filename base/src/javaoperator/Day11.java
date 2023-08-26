package javaoperator;

public class Day11 {
    public static void main(String[] args) {
        int a=11;
        int b=13;
        int score=98;

        System.out.println((a<b)?100:1);
        System.out.println((a<b)?"脱单钱多走上人生巅峰":"平淡的生活有钱的日子");
        System.out.println((score>90)?"学神":"学霸");//比if方便，必须掌握
    }
}
