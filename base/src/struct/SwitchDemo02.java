package struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "永远的神";
        //字符的本质还是数字
        //反编译 java----class文件------反编译（IDEA）


        switch(name){
            case"姜栋宇":
                System.out.println("姜栋宇");
                break;
            case"永远的神":
                System.out.println("yyds");
                break;
                default:
                    System.out.println("搞错了，再来！");

        }
    }
}
