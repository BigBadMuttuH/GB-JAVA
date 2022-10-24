package a_lectures.IntelIDEA.Lec07;

import java.util.HashMap;
import java.util.Map;

public class Map_Multi_set_bag {
    public static void main(String[] args) {

    }

    // Множества, в котором допустимы повторы.
    // Т.е. нам нужна Map, которая отображает элементы и их количество (не меньше одного)
    Map<String, Integer> counts = new HashMap<>();

    void add1(String key) {
        Integer count = counts.get(key);
        if (count == null) {
            count = 0;
        }
        counts.put(key, count + 1);
    }

    // вот так можно
    void add2(String key) {
        // merge - похож на put If absent
        // тут передаем как склеить значение, если оно новое
        //  1 - увеличиваем на единицу старое значение
        // a - старое значение
        // b - новое значение
        counts.merge(key, 1, (a, b) -> a + b);
        // Java предлагает вот так:
//        counts.merge(key, 1, Integer::sum);
    }
}
