//遍历整个数组
package Array;

public class Demo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

//方法1：
//        for (int array : arrays) {
//       //arrays.for + 回车，直接出来增强型的for循环,可以直接遍历数组
//            System.out.println(array);
//
//        }
        printArray(arrays);
    }

//    //反转数组
//
//
//    for (int i = arrays.length - 1; i >= 0 ; i--) {
//            System.out.print(arrays[i] + " ");
//
//        }




    //打印数组元素,方法2：
    public static void printArray(int[]arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i] + "");

        }
    }

}
