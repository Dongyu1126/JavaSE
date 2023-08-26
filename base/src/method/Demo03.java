package method;
//方法重载比大小，就是一个类有2或多个方法，相同的名字（max），int或double类型都可以
public class Demo03 {
    public static void main(String[] args) {
        double ok = max(210, 21);
        System.out.println(ok);
    }
    //double型比大小
    public static double max(double a,double b){
        double result = 0;
        if (a==b){
            System.out.println("a==b");
            return 0;//终止方法
        }
        if (a>b){

            result =  a;
        }else {

            result =  b;
        }
        return result;
    }
    //int型比大小
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
