package bai3;

public abstract class Vehicle {
    String name;
    int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Một phương thức trừu tượng: void displayInfo().
    protected void displayInfo() {}

    // Một phương thức thông thường: void start() in ra "Vehicle is starting...".
    protected void start() {
        System.out.println("Vehicle is starting...");
    }
}
