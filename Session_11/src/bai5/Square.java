package bai5;

import java.awt.*;

public class Square implements Colorable {
    int x;

    public Square() {
    }

    Square(int x) {
        this.x = x;
    }

    @Override
    public void setColor(String color) {
        System.out.println(color);
    }

}
