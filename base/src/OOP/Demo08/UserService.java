//接口知识点
package OOP.Demo08;
//interface定义关键字,接口都需要有实现类
public interface UserService {

    //常量的定义，前面默认public static final
    int age = 99;
    //接口中的所有定义的方法其实都是抽象的,前面默认 public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
