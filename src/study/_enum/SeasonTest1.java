package study._enum;

public class SeasonTest1 {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING.getClass());
        System.out.println(Season1.SPRING.getClass().getSuperclass());

        System.out.println(Season1.SPRING);
        Season1 season1[]=Season1.values();
        for (int i = 0; i < season1.length; i++) {
            System.out.println(season1[i]);
        }
        System.out.println(Season1.valueOf("SUMMER"));
        System.out.println(Season1.SUMMER.ordinal());
    }
}
//jdk5.0后使用enum关键子定义枚举类
enum Season1{
    //1. 必须在枚举类的开头声明多个对象，对象之间用逗号隔开
    SPRING("春天","春暖花开"),
    SUMMER("夏天","烈日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","凛冬将至"),
    ;
    //2.0 声明当前类的对象的实例变量，使用private final修饰
    private final String SeasonName;
    private final String SeasonDesc;

    //3.0私有化构造器
    private Season1(String seasonName, String seasonDesc) {
        SeasonName = seasonName;
        SeasonDesc = seasonDesc;
    }
    //4.0提供实例变量的get方法
    public String getSeasonName() {
        return SeasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
