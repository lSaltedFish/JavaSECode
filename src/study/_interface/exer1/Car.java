package study._interface.exer1;

public class Car extends Vehicle implements IPower{
    private String carNumber;

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    @Override
    public void power() {
        System.out.println("汽车加油");
    }

    @Override
    public void run() {
        System.out.println("汽车通过发动机驱动");
    }
}
