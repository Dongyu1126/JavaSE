package OOP.exception;

public class Test2 {
    public static void main(String[] args) {

        try {
            new Test2().test(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        //选中之后，Ctrl+Alt+T
        /*try {

            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();//打印错误的栈信息
        } finally {
        }*/
    }

    //假设这个方法中，处理不了这个异常，方法上抛出异常
    public void test(int a,int b) throws ArithmeticException{
        if (b==0){ // throw throws
            throw new ArithmeticException();//主动抛出异常,一般在方法中使用
        }
        System.out.println(a/b);
    }
}
