package bai4;

public class Radio implements Electronic{
    String brand;

    public Radio(String brand) {
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Radio...");
    };

    @Override
    public void turnOff() {
        System.out.println("Turning off Radio...");
    };
}
