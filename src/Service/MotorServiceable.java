package Service;

abstract class MotorServiceable extends WheeledServiceable {
    public MotorServiceable(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
