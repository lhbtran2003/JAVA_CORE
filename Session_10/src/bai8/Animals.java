package bai8;

public class Animals {
    protected String name;
    protected int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String makeSound() {
        return "Some generic sound";
    }
}
