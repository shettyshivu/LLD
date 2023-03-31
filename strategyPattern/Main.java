package strategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle activa125 = new NormalVehicle();
        Vehicle ninja300 = new SportsVehicle();
        Vehicle himalaya = new OffRoadVehicle();

        activa125.start();
        ninja300.start();
        himalaya.start();
    }
}
