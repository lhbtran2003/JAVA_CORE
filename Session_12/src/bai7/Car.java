package bai7;

public class Car extends Vehicle {
    @Override
    void sound() {
        System.out.println( "Car sound");
    }

    @Override
    void  move() {
        System.out.println( "Car move");
    }
}
