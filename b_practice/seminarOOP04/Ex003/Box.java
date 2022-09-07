package b_practice.seminarOOP04.Ex003;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Box<E extends Fruit> implements Comparator<Box> {
//public class Box<E extends Fruit> implements Comparable<Box> {
    private List<E> fruitBox = new ArrayList<>();
    private double weight;

    public Box(List<E> fruitBox) {
        this.fruitBox = fruitBox;
        for (E fruit : fruitBox) {
            weight += fruit.getWeight();
        }
    }

    public List<E> getFruitBox() {
        return fruitBox;
    }

    public void putFruit(E fruit) {
        fruitBox.add(fruit);
        weight = weight + fruit.getWeight();
    }

    public void takeFruit(E fruit) {
        fruitBox.remove(fruit);
        weight = weight - fruit.getWeight();
    }

    public double getWeight() {
        return weight;
    }

//    @Override
//    public int compareTo(Box o) {
//        return 0;
//    }

    public boolean compare(Box box) {
        return compare(this, box) == 0;
    }

    @Override
    public int compare(Box o1, Box o2) {
        return o1.getWeight() != o2.getWeight() ? 1 : 0;
    }
}
