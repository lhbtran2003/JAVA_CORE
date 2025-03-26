package bai6;

import java.util.*;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> arrAnimals = new ArrayList<Animal>();

        arrAnimals.add(new Elephant());
        arrAnimals.add(new Lion());


        for (Animal animal : arrAnimals) {
            animal.sound();
            animal.move();
        }
    }
}
