package Bai4;

public class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double r) {
        this.radius = r;
    }

    //getArea(): Tính diện tích hình tròn theo công thức Area= PI * radius2
    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    // getCircumference(): Tính chu vi hình tròn theo công thức Circumference=2 × PI × radius
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // display(): Hiển thị thông tin bán kính, diện tích và chu vi của hình tròn.
    public  void display() {
        System.out.printf("Bán kính = %f\n", this.radius);
        System.out.printf("Chu vi = %f\n", this.getCircumference());
        System.out.printf("Dien tich = %f\n", this.getArea());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();
        Circle c2 = new Circle();
        c2.display();
    }
}
