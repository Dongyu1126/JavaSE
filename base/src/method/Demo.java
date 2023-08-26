package method;

public class Demo {
    public static void main(String[] args) {//main方法，这种一般是交给程序管的，不归咱们管
          int sum = add(1, 2);
          System.out.println(sum);
        System.out.println("##################");
        test();

    }
    //加法
    public static int add(int a,int b){//加static让它变成类变量，上面就可调用add
        return a+b;
    }//main方法要尽量简洁干净，把公共模块尽量放在外面
    public static void test(){//它不需要返回数字，用void（空），然后随便一个名字命名如test
        for (int i = 1;i <= 100; i++){
            System.out.println(i);
        }//个人理解，return是返回一个值，void类型它支持产生更多的值，且void和return不能同时使用
    }
}
