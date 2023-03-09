package Service;

public class ServiceStation {
    void updateTyre(int wheelsCount) {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void check() {
    }
}