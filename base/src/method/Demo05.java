package method;
//可变参数
public class Demo05 {
    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();
        demo05.test(1,2,3,4,5);
    }
    public void test(int x,int... i){//可变参数必须放在后面，不能放在int x前面
        System.out.println(i[0]);
        System.out.println(i[3]);

    }


}
