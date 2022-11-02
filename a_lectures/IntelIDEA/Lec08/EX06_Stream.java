package a_lectures.IntelIDEA.Lec08;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EX06_Stream {
    public static void main(String[] args) {
        // Неправильно
        // если увеличить до 50, то будет беда.
        // Из-за другого алгоритма сортировки с большими числами
        IntStream.range(1, 10)
                .boxed()
                .sorted((a, b) -> Math.random() > 0.5 ? 1 : -1)
                .forEach(System.out::println);

        // Так правильно!
        List<Integer> list = IntStream.range(1, 50)
                                      .boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        list.forEach(System.out::println);

        // iterate()
//                .limit(10)
//                .sorted()
//        если поменять эти строчки местами будет проблема
//        сначала все нужно будет отсортировать, а уже потом отобрать 10
//
        IntStream.iterate(1, x -> x * 2)
                .limit(10)
                .sorted()
                .forEach(System.out::println);
    }
}
