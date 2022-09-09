package b_practice.seminarOOP05.Company.Model.connector;

import java.util.Random;

public interface WorkToDay {

    private int workToDay(int level) {

        Random r = new Random();
        return level + r.nextInt(-10, 10);

    }
}