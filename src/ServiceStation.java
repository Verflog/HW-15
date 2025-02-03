public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        }
        if (transport != null && transport.getClass().equals(Car.class) | transport.getClass().equals(Truck.class)) {
            ((Car) transport).checkEngine();
        } else if (transport != null && transport.getClass().equals(Bicycle.class)) {
            System.out.println("Обслуживание завершено");
        }
        if (transport != null && transport.getClass().equals(Truck.class)) {
            ((Truck) transport).checkTrailer();
            System.out.println("Обслуживание завершено");
        } else if (transport != null && transport.getClass().equals(Car.class)) {
            System.out.println("Обслуживание завершено");
        }
    }
}