package study.object.exer2;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return
     */
    public double findArea(){
        return 3.14*radius*radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Circle){
            Circle circle = (Circle) obj;
            return this.radius == circle.radius && this.color == circle.color && this.weight == circle.weight;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Circle{"+
                "raidus="+radius+"}";
    }
}
