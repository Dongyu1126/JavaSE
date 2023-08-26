package struct;
//输出1~1000之间能被5整除的数，并且每行输出3个
public class ForDemo02 {
    public static void main(String[] args) {
        for(int i = 1;i<=1000;i++){
            if(i%5==0){
                System.out.print(i+"\t");//println变成print； +"\t"是为了每个数之间有界限美观
            }
            if(i%(5*3)==0){//每行
                System.out.println();//这个表示换行，或者用下面这个
                //System.out.print("\n");

            }
/*
println表示输出完会换行；print表示输出完不会换行
 */
        }
    }
}
