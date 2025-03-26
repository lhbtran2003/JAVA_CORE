package bai5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> allShapes = new ArrayList<Shape>();
        allShapes.add(new Circle(5.5));
        allShapes.add(new Rectangle(5.5, 6.6));
        allShapes.add(new Square(9.9));

        for (Shape shape : allShapes) {
            System.out.println(shape.area());
        }

    }
}
