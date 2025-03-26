package bai8;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    public static void main(String[] args) {
        List<Car> garages = new ArrayList<Car>();
        garages.add(new ElectricCar("Tesla Model 3", 2023, 50000));
        garages.add(new GasCar("Toyota Camry", 2022, 35000));

        for (Car car : garages) {
            car.start();
            car.stop();
            car.refuel();
        }
    }
}
