package study._enum;

public class SeasonTest2 {
    public static void main(String[] args) {
//        System.out.println(Season2.SPRING.getClass());
//        System.out.println(Season2.SPRING.getClass().getSuperclass());
//
//        System.out.println(Season2.SPRING);
//        Season1 season2[]=Season2.values();
//        for (int i = 0; i < season2.length; i++) {
//            System.out.println(season2[i]);
//        }
//        System.out.println(Season1.valueOf("SUMMER"));
//        System.out.println(Season1.SUMMER.ordinal());
        Season2.SPRING.test();
        Season2.SUMMER.test();
    }
}
interface info{
    void test();
    void test1();
}
//jdk5.0后使用enum关键子定义枚举类
enum Season2 implements info {
    //1. 必须在枚举类的开头声明多个对象，对象之间用逗号隔开
    SPRING("春天","春暖花开"){
        @Override
        public void test() {

        }
    },
    SUMMER("夏天","烈日炎炎"){
        @Override
        public void test() {

        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void test() {

        }
    },
    WINTER("冬天","凛冬将至"){
        @Override
        public void test() {

        }
    };

    private final String SeasonName;
    private final String SeasonDesc;

    //3.0私有化构造器
    private Season2(String seasonName, String seasonDesc) {
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



    @Override
    public void test1() {

    }

//    @Override
//    public void test() {
//        System.out.println("春夏秋冬");
//    }
}
