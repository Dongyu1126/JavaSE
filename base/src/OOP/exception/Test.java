//捕获和抛出异常
//处理异常的五个关键字：try;catch;finally;throw;throws
package OOP.exception;

public class Test {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {//try监控区域
            //System.out.println(a/b);
            new Test().a();


            //要捕获多个异常：要从小到大！否则报错
        }catch (Exception e){//catch(想要捕获的异常类型) 捕获异常
            System.out.println("Exception");
        }catch (Error e){
            System.out.println("Error");
        }catch (Throwable e){
            System.out.println("Throwable");
        } finally {//处理善后工作，无论有无异常，finally终究会被执行
            System.out.println("finally");
        }
        //finally可以不要，但是如IO流或资源之类的东西要关闭，可以用finally

    }

    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
