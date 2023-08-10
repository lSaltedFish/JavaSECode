package study.object.exer2;

/**
 *   案例：
 *   定义两个类，父类GeometricObject代表几何形状，子类Circle代表圆形。
 *   写一个测试类，创建两个Circle对象，判断其颜色是否相等；利用equals方法判断半径是否相等；
 *   利用toString()方法输出半径
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
