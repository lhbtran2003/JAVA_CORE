package bai8;

public class Dogs extends Animals{
    String breed; // giống chó

    public Dogs(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    public String makeSound() {
        return "Gâu gâu";
    }

    @Override
    public void displayInfo() {
       super.displayInfo();
       System.out.println("Breed: " + breed);

    }

}
