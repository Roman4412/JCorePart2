package Service;

public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre(getWheelsCount());
        checkEngine();
        checkTrailer();
    }
}