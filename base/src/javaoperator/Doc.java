package javaoperator;

/**
 * @author kuangshen
 * @version 1.0
 * @since 1.8
 */
public class Doc {
    String name;//这个在Doc类里，称类变量,是属性

    /**
     * @author kuangshen
     * @param name
     * @return
     * @throws Exception//抛出异常
     */

    public String test(String name) throws Exception{//这是一个方法
        return name;
    }
}
