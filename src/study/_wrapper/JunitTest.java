package study._wrapper;

import org.junit.Test;

public class JunitTest {
    @Test
    public void Test(){
        //底层会调用Integer类中的valueOf()方法，该方法会缓存-128到127之间的数，在范围内返回int类型，超过范围返回包装类型数据
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1==i2);//true
        Integer integer1 = 128;
        Integer integer2 = 128;
        System.out.println(integer1==integer2);//false

        Integer m = 10;
        Double n = 10.2;
    //  System.out.println(m==n);//编译报错

        Integer a = 1000;
        double  b = 1000;
        System.out.println(a==b);//true   自动拆箱  编译器自动将a拆箱为int基本数据类型

        Integer x = 1000;
        int y = 1000;
        System.out.println(x==y);//true  同上
    }
}
