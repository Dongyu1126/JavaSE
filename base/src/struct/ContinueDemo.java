package struct;
//continue用于终止某/一次循环过程，跳过程序中尚未执行的语句，接着进行下一次是否执行循环的判定
public class ContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            if(i%10==0){
                System.out.print("\n");

                continue;
            }
            System.out.print(i+"\t");
        }
    }
}
