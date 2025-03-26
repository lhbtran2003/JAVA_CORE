package bai4;

public class Shape {
    double area() {
        return 0.0;
    }

    double area (double radius) {
        return Math.PI * radius * radius;
    }

    double area (double height, double width) {
        return height * width;
    }
}
