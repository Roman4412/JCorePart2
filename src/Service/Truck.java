package Service;

public class Truck extends MotorServiceable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }


}