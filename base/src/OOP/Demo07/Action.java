package OOP.Demo07;
//abstract 抽象类
public abstract class Action {

    //约束，需要有人帮我实现
    //abstract，抽象方法，只有方法名字，没有方法的实现！
    public abstract void doSomething();

    //1.不能new这个抽象类，只能靠子类去实现它，约束
    //2.抽象类中可以写普通的方法；
    //3.抽象方法必须在抽象类中
    //抽象的抽象：约束

    /*思考题：抽象类这么麻烦，它的意义是？
    暂时不需要做的东西抽象出来，等需要的时候改一下就ok，提高开发效率！
     */
}
