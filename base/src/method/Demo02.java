package method;
//比大小
public class Demo02 {
    public static void main(String[] args) {
        int ok = max(6,10);
        System.out.println(ok);
    }
    public static int max(int a,int b){
        int result = 0;
        if (a==b){
            System.out.println("a==b");
            return 0;//终止方法
        }
        if (a>b){

            result = a;
        }else {

            result =  b;
        }
        return result;
    }
}
