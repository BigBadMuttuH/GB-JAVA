package b_practice.seminarOOP02.EX001;

import java.util.ArrayList;

public class Human implements Printable {
    private final String name;
    ArrayList<Animal> animals = new ArrayList<>();

    public Human(String name) {
        this.name = name;
    }

    public void append(Animal animal) {
        animals.add(animal);
    }
//
//    public void printAnimals() {
//        for (Animal animal : animals ) {
//            System.out.println(animal);
//        }
//    }
}
