package study._static;

/**
 *  单例模式--懒汉式
 */
public class SingletonTestL {

}
class  SingletonL{
    //1.构造器私有化
    private SingletonL(){

    }
    //2.声明当前类的实例
    private static SingletonL instance = null;

    //3.通过get方法获取当前类的实例，如果为创建对象，则在方法内部创建
    public static SingletonL getInstance(){
        if (instance == null){
            instance = new SingletonL();
        }
        return instance;
    }

}
