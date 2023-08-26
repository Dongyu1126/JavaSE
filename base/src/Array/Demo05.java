//多维数组，如二维数组
package Array;

import com.sun.media.sound.AiffFileReader;

public class Demo05 {
    public static void main(String[] args) {

        /*
        {1,2}    array[0]
        {2,3}    array[1]
        {7,8}    array[2]
         */
        int[][] array = {{1,2},{2,3},{7,8}};

        //System.out.println(array[0]);//用此方法会乱码，无法直观表现这个二维数组
        printArray(array[0]);
        System.out.println(array[2][0]);
        System.out.println(array[2][1]);
        System.out.println(array.length);//数组长度是3
        System.out.println(array[0].length);//数组{1,2}的长度是2
        
        //遍历整个数组
        System.out.println("**********************************");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
            
        }
    }
//打印数组元素
    public static void printArray(int[]arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
