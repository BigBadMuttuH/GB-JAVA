package a_lectures.IntelIDEA.Lec07;


import java.util.Map;
import java.util.function.BiConsumer;

public class Map_Iterate {
    public static void main(String[] args) {

    }

    // Обход Map
    //
    void iterateOverMap1(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }

    /*
    Так тоже работает, но делать так не надо. Слишком медленно.
    А если в map будет много коллизий, то можно попасть под DDos атаку.
     */
    //    void iterateOverMap(Map<String, Integer> map){
    //        for (String key: map.keySet()) {
    //            Integer value = map.get(key);
    //            System.out.println(key + " -> " + value);
    //        }
    //    }

    // Альтернативный рабочий вариант
    void iterateOverValues(Map<String, Integer> map) {
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }

    // Обход в функциональном стиле
    // так делать не надо:
    // Есть lambda -> смотри ниже!
    void iterateOverMap2(Map<String, Integer> map) {
        map.forEach (new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + " -> " + value);
            }
        });
    }

    // Есть недостаток:
    // Нельзя прервать такой вывод
    void iterateOverMap3(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}