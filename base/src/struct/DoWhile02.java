package struct;

public class DoWhile02 {
    public static void main(String[] args) {
        int a = 0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("----------------------");
        do{
            System.out.println(a);
            a++;
        }while (a<0);//都是不满足a<0的条件的，但是do由于先执行一次，所以输出了a=0
    }
}
