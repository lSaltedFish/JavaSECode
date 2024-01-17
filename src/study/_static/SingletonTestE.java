package study._static;

/**
 * 单例模式--饿汉式
 */
public class SingletonTestE {

}
class Singleton{
    // 1.构造器私有化
    private Singleton(){

    }
    // 2.在类的内部声明并创建实例
    private static  Singleton instance = new Singleton();
    // 3.通过get方法获取当前类的实例
    public static Singleton getInstance(){
        return instance;
    }

}
