package bai8;

import java.util.ArrayList;
import java.util.List;

public class AnimalManagement {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<Animals>();
        animals.add(new Dogs("Poca", 3, "Poodle"));
        animals.add(new Cats("Bơ", 2, "Xám"));

        for (Animals a : animals) {
            if (a instanceof Dogs) {
                a.displayInfo();
            } else if (a instanceof Cats) {
                a.displayInfo();
            }
        }
    }
}
