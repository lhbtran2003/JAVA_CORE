package bai5;

public class Cylinder extends Circle{
    private double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }
}
