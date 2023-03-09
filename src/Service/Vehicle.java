package Service;

abstract public class Vehicle extends ServiceStation{
    final private String modelName;
    final private int wheelsCount;

     Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected String getModelName() {
        return modelName;
    }
    protected int getWheelsCount() {
        return wheelsCount;
    }
}

