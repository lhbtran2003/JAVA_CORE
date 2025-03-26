package bai7;

public class Bus extends Vehicle{
    @Override
    void sound() {
        System.out.println( "Bus sound");
    }

    @Override
    void  move() {
        System.out.println( "Bus move");
    }
}
