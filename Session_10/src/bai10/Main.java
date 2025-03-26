package bai10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("hình tròn", 2.2);
        Rectangle r = new Rectangle("Hình chu nhật", 3,5);
        Triangle t = new Triangle("Hình tam giác", 6,4,5);
//        System.out.println(c);
//        System.out.println(r);
//        System.out.println(t);

        List<Shape> arrShape = new ArrayList<Shape>();
        arrShape.add(c);
        arrShape.add(r);
        arrShape.add(t);

        for (Shape s : arrShape) {
            if (s instanceof Circle) {
                System.out.printf("Chu vi hình tròn = %.2f\n", c.calculatePerimeter());
                System.out.printf("Diện tích hình tròn = %.2f\n", c.calculateArea());
            } else if (s instanceof Rectangle) {
                System.out.printf("Chu vi hình chữ nhâật = %.2f\n", r.calculatePerimeter());
                System.out.printf("Diện tích hình chữ nhâật = %.2f\n", r.calculateArea());

            } else if (s instanceof Triangle) {
                System.out.printf("Chu vi hình tam giác = %.2f\n", t.calculatePerimeter());
                System.out.printf("Diện tích hình tam giác = %.2f\n", t.calculateArea());
            }
        }
    }
}
