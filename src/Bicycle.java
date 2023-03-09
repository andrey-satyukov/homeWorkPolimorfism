public class Bicycle implements TrandportVehicle{

    public String modelName;
    public int wheelsCount;

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}