package study._static;

public class StaticTest {
    public static void main(String[] args) {
        Damo damo = new Damo();
    }
}

class Damo{
    public Damo() {
        System.out.println("构造方法执行---");
    }
    public static void staticTest(){
        System.out.println("静态方法执行---");
    }
    static {
        System.out.println("静态代码块执行---");
    }
}
