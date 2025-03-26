package bai6;

public class Lion extends Animal{
    @Override
    public  void sound() {
        System.out.println("Roar!" );
    }

    @Override
    public void move() {
        System.out.println( "The lion is running." );
    }
}
