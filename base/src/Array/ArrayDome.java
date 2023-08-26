//数组类的使用
package Array;

import java.util.Arrays;//因为Arrays首字母大写，且有import，所以为类（class）

public class ArrayDome {
    public static void main(String[] args) {
        int[] a = {1,203,66775,88,9019,1688};

        //打印数组元素
        System.out.println(a);//[I@1b6d3586
        System.out.println(Arrays.toString(a));//工具类方法
        printArray(a);//自己写的方法


        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        //数组按大小排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //拓展一个类的应用：填充
        Arrays.fill(a,0);//把数组a的值都赋给0
        System.out.println(Arrays.toString(a));



    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                System.out.print("[");
            }
            if (i == a.length-1){
                System.out.print(a[i]+"]");
            }else{
                System.out.print(a[i] + ",");

            }

        }
    }

}
