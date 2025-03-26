package bai7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Bus());

        for (Vehicle vehicle : vehicles) {
            vehicle.sound();
            vehicle.move();
        }
    }
}
