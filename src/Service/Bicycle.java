package Service;

public class Bicycle extends WheeledServiceable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
    }
}