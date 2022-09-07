package b_practice.seminarOOP04.Ex003;

import java.util.Random;

public abstract class Fruit {
    private int weight;

    public Fruit(int weight) {
        this.weight = (int) (new Random().nextDouble() * 10);
    }

    public int getWeight() {
        return weight;
    }
}
