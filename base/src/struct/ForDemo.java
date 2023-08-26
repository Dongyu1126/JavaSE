package struct;
//计算0~100之间的奇数和偶数的和
public class ForDemo {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 1;i<=100;i++){
            if(i%2 ==1){
                oddSum+=i;
            }else{
                evenSum+=i;
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
