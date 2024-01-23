package study._enum;

/**
 *
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }

}
//jdk5.0之前定义枚举类的方式
class Season{
    //2.0 声明当前类的对象的实例变量，使用private final修饰
    private final String SeasonName;//季节名称

    private final String SeasonDesc;//季节描述

    //1.0私有化构造器
    private Season(String seasonName, String seasonDesc) {
        SeasonName = seasonName;
        SeasonDesc = seasonDesc;
    }
    //3.0提供实例变量的get方法
    public String getSeasonName() {
        return SeasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
    //4.0创建当前类的实例
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","烈日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","凛冬将至");

}