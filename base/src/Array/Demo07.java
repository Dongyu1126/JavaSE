/*
冒泡排序:
1：比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
2：每一次比较，都会产生出一个最大，或者最小的数字
3：下一轮则可以少一次排序
4：依次循环，直到结束
 */
package Array;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int[] a = {32,78,16,50,2,1,8,10};
        //调用步骤： "sort(a);"之后加Alt+Enter
        int[] sort = sort(a);//调用一下我们自己写的排序方法后，返回一个排序

        System.out.println(Arrays.toString(a));

    }
    public static int[] sort(int[] array){
        //临时变量。用于交换
        int temp = 0;

        //外层循环，判断我们这个要走多少次；
        for (int i = 0; i < array.length-1; i++) {//第一个循环length-1是一共要比较的轮数
            //内层循环，比较判断2个数，如果第一个数，比第二个数大，则交换位置

            boolean flag = false;//通过flag标识位减少没有意义的比较
            for (int j = 0; j < array.length-1-i; j++) {
                /*
                第二个循环剩余的需要比较的次数，-i是为了减少一次没有必要的循环，
                因为i是循环的次数，j就不需要再去比较i已经比较过得了
                 */
                if (array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = true;
                }

            }
            if(flag == false){//局部优化，如果flag为false，说明没有发生交换，证明不需要排序了
                break;
            }

        }

        return array;








    }
}
