import Service.Bicycle;
import Service.Car;
import Service.ServiceStation;
import Service.Truck;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation.check(car1);
        ServiceStation.check(car2);
        ServiceStation.check(truck1);
        ServiceStation.check(truck2);
        ServiceStation.check(bicycle1);
        ServiceStation.check(bicycle2);
    }
}