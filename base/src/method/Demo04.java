package method;
//命令行传参
public class Demo04 {
    public static void main(String[] args) {
        //args.length 数组长度
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i +"]:" +args[i]);
        }
    }
}
