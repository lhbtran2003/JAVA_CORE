package bai4;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2.2);
        Shape rectangle = new Rectangle(2.2, 2.2);
        Shape shape = new Shape();

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(  shape.area(1,1));
        System.out.println(shape.area(2.2));
    }
}

