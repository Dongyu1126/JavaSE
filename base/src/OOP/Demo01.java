//方法的定义
package OOP;

import java.io.IOException;

//Demo01就是类
public class Demo01 {
    //这里面的方法就是main方法
    public static void main(String[] args) {

    }

    //定义方法:public表示所有人都可以用 ；String是表示返回的类型，此题表示返回一个字符串；
    // sayhello是方法的名字
    //return跟break相识，，return是结束方法，返回一个结果！break是跳出switch，if，while等，结束循环

    public String sayhello(){
        return "hello,world";
        //System.out.println("hello");报错。因为已经返回关键词，方法已经结束
    }
    /*
    修饰符 返回值类型 方法名（...）{
   方法体
   return 返回值;

    }
     */
    public void hello(){//void没有返回值
        return;//return为空
    }

    public int max(int a,int b){
        return a>b ? a : b;//三元运算符！
    }


    public void readFile(String file) throws IOException{
        //throws IOException 抛出一个异常
    }
}
