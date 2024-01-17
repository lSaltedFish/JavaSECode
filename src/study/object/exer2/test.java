package study.object.exer2;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Circle c1 = new Circle("red",2.0,3.3);
        Circle c2 = new Circle("red",3.2,3.4);
        System.out.println("颜色是否相等："+c1.getColor().equals(c2.getColor()));
        System.out.println("半径是否相等："+c1.equals(c2));
        System.out.println("c1的半径为："+c1.toString());

    }
}
