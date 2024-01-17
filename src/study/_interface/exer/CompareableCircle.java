package study._interface.exer;

public class CompareableCircle extends Circle implements CompareObject{
    public CompareableCircle() {
    }

    public CompareableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof CompareableCircle){
            CompareableCircle circle = (CompareableCircle) o;
           if (this.getRadius()>circle.getRadius()){
               return 1;
           }else if (this.getRadius()<circle.getRadius()){
               return -1;
           }else {
               return 0;
           }
        }else {
            throw new RuntimeException("输入类型不匹配");
        }

    }
}
