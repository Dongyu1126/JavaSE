package Array;

public class Demo02 {
    public static void main(String[] args) {
        //静态初始化：创建+赋值
        int[] a = {1,21,32,4,5,66};
        //a[1] = 2;
        System.out.println(a[1]);

        //动态初始化:创建和赋值是分开的
        int[] b = new int[6];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        //b[3],b[4],b[5]没有给其赋值，数组会有默认值0
        System.out.println(b[0]);
        System.out.println(b[4]);
    }
}

//知识点1:数组是相同数据类型（数据类型可以为任意类型）的有序集合***
//知识点2：数组也是对象，数组元素相当于对象的成员变量*
//知识点3：不可变的。如果越界，则报：ArrayIndexOutofBounds**