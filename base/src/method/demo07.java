//栈溢出
package method;


public class demo07 {
    public static void main(String[] args) {
        demo07 test = new demo07();
        test.test();
    }
    public void test(){
        test();
    }
}
