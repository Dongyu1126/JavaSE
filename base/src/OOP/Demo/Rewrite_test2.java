package OOP.Demo;
//instanceof判断关系的:要求两类的包含关系，不能是并列关
public class Rewrite_test2 {
    public static void main(String[] args) {

        Object object = new Rewrite1();

        //关系网络Object > Rewrite2 > Rewrite1
        System.out.println(object instanceof Rewrite1);//true
        System.out.println(object instanceof Rewrite2);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Rewrite3);//false
        System.out.println(object instanceof String);//false

        //关系网络Object > Rewrite2 > Rewrite3
        Rewrite2 rewrite2 = new Rewrite3();
        System.out.println("=========================================");
        System.out.println(rewrite2 instanceof Rewrite1);//false因为关系都是单独的线，不算分支
        System.out.println(rewrite2 instanceof Rewrite2);//true
        System.out.println(rewrite2 instanceof Object);//true
        System.out.println(rewrite2 instanceof Rewrite3);//true
        //System.out.println(rewrite2 instanceof String);//报错，因为Rewrite2和String是同级，二者不能比较
    }
}
