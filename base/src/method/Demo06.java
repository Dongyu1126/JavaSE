package method;
//知识点:递归(自己调用自己)
//求数字的阶层
public class Demo06 {
    public static void main(String[] args) {

        System.out.println(f(7));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
