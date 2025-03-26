package bai3;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Porsche", 300);
        Vehicle bike = new Bike("Tokyo", 300);

        car.start();
        car.displayInfo();
        bike.start();
        bike.displayInfo();

    }
}
