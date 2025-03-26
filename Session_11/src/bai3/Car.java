package bai3;

public class Car extends Vehicle {

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    protected void displayInfo() {
        System.out.println("Bike Info:" + name + " " + speed);
    }
}
