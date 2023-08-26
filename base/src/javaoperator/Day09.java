package javaoperator;

public class Day09 {
    public static void main(String[] args) {
        int A=0b1100;//1100
        int B=0b1101;//1101
        System.out.println(A);
        System.out.println(A&B);//与运算：1100
        System.out.println(A/B);//或运算：1101
        System.out.println(A^B);//相同为0，不同为1:0001
        System.out.println(~B);//非运算：0010
        //最终没有实现出来
        System.out.println("_________________________________");
        System.out.println(2<<3);/*表示2*2*2*2,最简单的2^4的运算
        不需要底层的大逻辑的运算,最省计算机计算量*/
        System.out.println(16>>3);//表示16的3次方跟运算
    }
}
