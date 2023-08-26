package struct;
//打印101~150之前的所有质数(除1以外的自然数中，只能被1和本身整除的数)
public class LabelDemo {
    public static void main(String[] args) {
        int count = 0;

        outer:for (int i=101;i<150;i++){//outer是一个标签
            for (int j=2;j<i/2;j++){
                if (i%j==0){
                    continue outer;//通过continue返回标签所在的位置,不输出
                }
            }
            System.out.print(i+"\t");
        }
    }//这种标签类的麻烦，不建议使用
}
