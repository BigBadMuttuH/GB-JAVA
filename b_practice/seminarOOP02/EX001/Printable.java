package b_practice.seminarOOP02.EX001;

import java.util.ArrayList;

public interface Printable {

    default void print(ArrayList<Animal> animals){
        for (Animal animal : animals) {
//            if (animal instanceof Cat) {}
//            System.out.println(animal.getName());
            System.out.println(animal);
        }
    }
}
