package bai5;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(1.5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(circle.getRadius(), 2);
        System.out.println(cylinder.getVolumn());

        // thay đổi giá trị bán kính và chiều cao thông qua các phương thức setter
        circle.setRadius(2);
        cylinder.setHeight(3);
        System.out.println(circle.getArea());
        System.out.println(cylinder.getVolumn());
    }
}
