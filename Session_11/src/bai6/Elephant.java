package bai6;

public class Elephant extends Animal{
    @Override
    public  void sound() {
        System.out.println("Trumpet!" );
    }

    @Override
    public void move() {
        System.out.println( "The elephant is walking." );
    }
}
