public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("car1", 4),
            new Car("car2", 4)
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };
        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };


        ServiceStation station = new ServiceStation();
        station.check(cars, null, null);
//        station.check(car2, null, null);
        station.check(null, bicycles, null);
//        station.check(null, bicycle2, null);
        station.check(null, null, trucks);
//        station.check(null, null, truck2);
    }
}