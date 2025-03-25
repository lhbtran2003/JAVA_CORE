package bai8;

public class Cats extends Animals{
    String furColor ; // màu lông

    public Cats(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    @Override
    public String makeSound() {
        return "Meo meo";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fur Color: " + furColor);

    }
}
