package struct;
//输出九九乘法表
public class ForDemo03 {
    public static void main(String[] args) {

        for (int j = 1; j <=9; j++) {//j是作左边的数字，且左边的数字要比右边的小
            for(int i = 1;i <=j;i++){
                System.out.print(i+"*"+j+"="+(j*i)+"\t");//print表示输出完不会换行

            }
            System.out.println();//表示换行
        }
/*
步骤1；我们先打印一列
步骤2：我们再套一个循环把全部的都输出来
步骤3：去掉重复项
步骤4：调整样式
 */

    }

}
