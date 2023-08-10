package study.object.exer1;

public class orderTest {

    public static void main(String[] args) {
        Order order1 = new Order(1001,"orderAA");
        Order order2 = new Order(1001,"orderAA");
        System.out.println(order1.equals(order2));

        Order order3 = new Order(1002,new String("orderBB"));
        Order order4 = new Order(1002,new String("orderBB"));
        System.out.println(order3.equals(order4));

        String str1 = "AA";
        String str2 = "AA";
        System.out.println(str1==str2);//true
                                // 此时str1和str2的内容相同，但是地址不同。如果Order类中重写equals()方法在判断String类型时使用==，
                                //那么判断会错误，所以重写equals()方法时，如果类属性中存在其他包装类，那么其他包装类中的equals()方法也要重写。
    }
}
