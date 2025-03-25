package bai10;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return String.format("Bán kính: %.2f - Diện tích: %.2f - Chu vi: %.2f", radius,calculateArea(),calculatePerimeter());
    }
}
