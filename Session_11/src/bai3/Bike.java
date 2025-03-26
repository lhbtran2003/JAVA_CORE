package bai3;

public class Bike extends Vehicle {

    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    protected void displayInfo() {
        System.out.println("Bike Info:" + name + " " + speed);
    }
}
