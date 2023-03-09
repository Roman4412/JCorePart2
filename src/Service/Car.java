package Service;

public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre(getWheelsCount());
        checkEngine();
    }
}
