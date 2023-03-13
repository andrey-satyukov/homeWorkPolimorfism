public class ServiceStation {
    public void check(Car car, Truck truck, Bicycle bicycle) {
        if (car != null) {
            car.carService();
        } else if (truck != null) {
            truck.truckService();
        } else if (bicycle != null) {
            bicycle.bicycleService();
        }
//        else if (trucks != null) {
//            for (int j = 0; j < trucks.length; j++) {
//                System.out.println("Обслуживаем " + trucks[j].getModelName());
//                for (int i = 0; i < trucks[j].getWheelsCount(); i++) {
//                    trucks[j].updateTyre();
//                }
//                trucks[j].checkEngine();
//                trucks[j].checkTrailer();
//            }
//        } else if (bicycles != null) {
//            for (int j = 0; j < bicycles.length; j++) {
//                System.out.println("Обслуживаем " + bicycles[j].getModelName());
//                for (int i = 0; i < bicycles[j].getWheelsCount(); i++) {
//                    bicycles[j].updateTyre();
//                }
//            }
//        }
    }
}