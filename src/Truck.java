public class Truck extends TransportVehicle{

    public String modelName;
    public int wheelsCount;



    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}