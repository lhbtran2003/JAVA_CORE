package Bai3;

public class Rectangle {
    double length;
    double width;

    // khởi tạo Construtor với kích thuoc mac dinh
    Rectangle() {
        length = 1;
        width = 1;
    }

    //Khởi tạo hình chữ nhật với chiều dài và chiều rộng do người dùng cung cấp.
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public void display() {
        System.out.printf("Chieu dai = %f", length);
        System.out.printf("Chieu rong = %f", width);
        System.out.printf("Dien tich = %f", getArea());
        System.out.printf("Chu vi = %f", getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(20, 30);

        rectangle1.getArea();
        System.out.println();
        rectangle1.getPerimeter();
        System.out.println();
        rectangle1.display();
        System.out.println();

        rectangle2.getArea();
        System.out.println();
        rectangle2.getPerimeter();
        System.out.println();
        rectangle2.display();
    }
}
