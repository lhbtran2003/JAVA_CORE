package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Electronic> arr = new ArrayList<>();
        arr.add(new TV("Sony"));
        arr.add(new TV("Toshiba"));
        arr.add(new TV("Samsung"));
        arr.add(new TV("LG"));
        arr.add(new Radio("A"));
        arr.add(new Radio("B"));
        arr.add(new Radio("C"));


       for (Electronic e : arr) {
          e.turnOn();
          e.turnOff();
       }
    }
}
