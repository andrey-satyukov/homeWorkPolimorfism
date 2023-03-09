public class Truck implements ChekEngine, TrandportVehicle{

    public String modelName;
    public int wheelsCount;



    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}