//稀疏数组:是一种数据结构——————————压缩算法
//需求编写五子棋游戏中，有存盘退出和续上盘的功能
package Array;

public class Demo08 {
    public static void main(String[] args) {
        //1.创建一个二维数组 11*11   0：没有棋子  1：黑棋  2：白棋

        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        //输出原始的数组
        System.out.println("原始的数组");
        //array1.for 加回车  ints.for 加回车

        for (int[] ints : array1) {//这就是增强for循环，不要懵逼
            for (int anInt : ints) {
                System.out.print(anInt + "\t");

            }
            System.out.println();//换行

        }
        //转换为稀疏数组来保存
        //获取有效值的个数
        int sum = 0;
        for (int i = 0;i<11;i++){
            for (int j = 0; j < 11; j++) {
                if (array1[i][j]!=0){
                    sum++;
                }

            }
        }
        System.out.println("有效值的个数："+ sum);

        //创建一个稀疏数组的数组
        int[][] array2 = new int[sum+1][3];

        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //遍历二维数组，将非零的值，存放于稀疏数组中
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j]!=0){
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];

                }

            }

        }

        //输出稀疏数组
        System.out.println("稀疏数组");

        for (int i = 0; i < array2 .length; i++) {
            System.out.println(array2[i][0]+"\t"
                    +array2[i][1]+"\t"
                    +array2[i][2]+"\t"
                    );
        }

        //稀疏数组还原
        System.out.println("===========================");
        System.out.println("还原");
        /*
        1.读取稀疏数组
        2.给元素还原值
        3.打印还原一下
         */
        int[][] array3 = new int[array2[0][0]][array2[0][1]];//一共11行11列

        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];//array3的横纵坐标 = 正确的取值
        }

        System.out.println("还原数组");
        //array1.for 加回车
        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");

            }
            System.out.println();//换行

        }



    }
}
