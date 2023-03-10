package Service;

abstract public class WheeledServiceable implements Serviceable {
    final private String modelName;
    final private int wheelsCount;
     WheeledServiceable(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    protected String getModelName() {
        return modelName;
    }

    protected int getWheelsCount() {
        return wheelsCount;
    }
    protected void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++)
            System.out.println("Меняем покрышку");
    }
}


