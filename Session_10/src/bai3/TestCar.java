package bai3;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        car.setYear("2026");
    }
}
