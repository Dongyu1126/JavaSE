//Java的Array（数组）就是Python里的list（列表）
package Array;

public class Demo01 {
    //数组
    public static void main(String[] args) {
        int[] nums;//声明数组（定义素组）

        nums = new int[10];//创建数组，含义就是创建可以存放10个int类型是数字
        //int[] nums = new int[10]; 这是一步到位的写法

        //给数组赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;


        System.out.println(nums[0]);

        //计算所有元素的和
        int sum = 0;
        //获取数组长度：arrays.length

        for (int i = 0; i < nums.length ; i++) {
            sum = sum + nums[i];
        }

        System.out.println("数组元素总和为："+sum);


    }
}
