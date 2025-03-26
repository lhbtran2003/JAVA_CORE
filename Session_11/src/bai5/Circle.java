package bai5;


public class Circle implements Colorable {
    int radius;
    public Circle () {

    }
    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
     public void setColor(String color) {
        System.out.println(color);
     }


}
