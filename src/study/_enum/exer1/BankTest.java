package study._enum.exer1;

public class BankTest {

}

//JDK5.0之前使用枚举类定义单例模式
class Bank1{
    private Bank1(){
    }
    public static final Bank1 instance = new Bank1();
}

//JDK5.0之后使用枚举类定义单例模式
enum Bank2{
    CPB;
}

enum GirlFriend{
    LI(18);
    private final int age;

    private GirlFriend(int age) {
        this.age = age;
    }
}