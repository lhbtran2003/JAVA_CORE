package bai7;

public class Bike extends Vehicle {
    @Override
    void sound() {
        System.out.println( "Bike sound");
    }

    @Override
    void  move() {
        System.out.println( "Bike move");
    }
}
