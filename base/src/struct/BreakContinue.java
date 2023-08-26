package struct;
//break用于强行退出循环
public class BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while(i<100){
            i++;
            System.out.println(i);
            if(i==30){
                break;
            }
            System.out.println("orientate");//到了30满足条件以后，break直接给它跳出
        }
        System.out.println("jdy,yyds");
    }
}
