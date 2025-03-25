package bai10;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return String.format("Chiều rộng: %.2f - Chiều cao: %.2f - Diện tích: %.2f - Chu vi: %.2f", width,height,calculateArea(),calculatePerimeter());
    }
}
