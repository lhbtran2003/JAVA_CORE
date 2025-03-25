package bai5;

public class Circle {
    //  có thuộc tính bán kính và phương thức tính diện tích của hình tròn
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea () {
        return Math.PI * radius * radius;
    }

}
