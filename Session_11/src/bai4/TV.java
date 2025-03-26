package bai4;

public class TV implements Electronic{
    String brand;

    public TV(String brand) {
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on TV...");
    };

    @Override
    public void turnOff() {
        System.out.println("Turning off TV...");
    };

}
