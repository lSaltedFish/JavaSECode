package study.polymorphism.exer1;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red",1.0,2.3);
        Circle c2 = new Circle("red",1.0,3.3);
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        boolean isEquals = test.equalsArea(c1,c2);
        if(isEquals){
            System.out.println("面积相等");
        }else {
            System.out.println("面积不相等");
        }
        test.displayGeometricObject(new MyRectangle("blue",2.3,3.3,2));
        GeometricObject c3 = new MyRectangle("red",2,3,4);//向上转型体现多态性
        //c3.test;   多态中父类引用无法调用子类特有的属性和方法
    }

    /**
     * 比较几何图形的面积是否相等
     * @param g1
     * @param g2
     * @return
     */
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea()==g2.findArea();
    }

    /**
     * 显示几何图形的面积
     * @param geometricObject
     */
    public void displayGeometricObject(GeometricObject geometricObject){
        System.out.println("几何图形的面积为："+geometricObject.findArea());
    }
}
