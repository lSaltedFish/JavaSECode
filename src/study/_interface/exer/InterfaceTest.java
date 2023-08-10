package study._interface.exer;

public class InterfaceTest {
    public static void main(String[] args) {
        CompareableCircle c1 = new CompareableCircle(2.3);
        CompareableCircle c2 = new CompareableCircle(5.3);

        int compareValue = c1.compareTo(c2);
        if(compareValue > 0){
            System.out.println("c1对象大");
        }else if (compareValue < 0){
            System.out.println("c2对象大");
        }else {
            System.out.println("一样");
        }
    }
}
