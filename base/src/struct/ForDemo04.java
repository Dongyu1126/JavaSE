package struct;
//增强型for循环
public class ForDemo04 {
    public static void main(String[] args) {
        int[]numbers = {10,20,30,40,50};//定义一个数组
        for(int i = 0;i<5;i++){
            System.out.println(numbers[i]);

        }
        System.out.println("--------------------------");

        for(int x:numbers){//遍历了数组的元素
            System.out.println(x);
        }
    }
}
