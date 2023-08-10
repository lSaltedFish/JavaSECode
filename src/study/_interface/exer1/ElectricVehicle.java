package study._interface.exer1;

public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void power() {
        System.out.println("电车充电");
    }

    @Override
    public void run() {
        System.out.println("电车通过电瓶驱动");
    }

}
