package study._interface.exer1;

public class Bicycle extends Vehicle{
    @Override
    public void run() {
        System.out.println("自行车使用人工助力");
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }
}
