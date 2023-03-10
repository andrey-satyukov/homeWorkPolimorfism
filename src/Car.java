public class Car implements ChekEngine, TrandportVehicle {

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void carService(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
}