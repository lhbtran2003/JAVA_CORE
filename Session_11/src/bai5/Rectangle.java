package bai5;


public class Rectangle implements Colorable {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    @Override
    public void setColor(String color) {
        System.out.println(color);
    }
//    public void display() {
//        System.out.println(color);
//    }
}
