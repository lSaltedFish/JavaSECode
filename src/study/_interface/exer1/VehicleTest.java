package study._interface.exer1;

public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特","红色");
        vehicles[1] = new ElectricVehicle("艾玛","绿色");
        vehicles[2] = new Car("奔驰","黑色","苏A666");

        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);
            if (vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }
    }
}
