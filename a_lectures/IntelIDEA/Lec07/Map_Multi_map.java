package a_lectures.IntelIDEA.Lec07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Multi_map {
    public static void main(String[] args) {

    }

    // если list есть, добавляем к нему значение, если нет, добавляем в Map
    Map<String, List<String>> multiMap = new HashMap<>();

    void add1(String key, String value) {
        List<String> list = multiMap.get(key);
        if (list == null) {
            list = new ArrayList<>();
            multiMap.put(key, list);
        }
        // фокус с кучей
        list.add(value);
    }

    // боле простой вариант
    // работает в новых Java (8 и более)
    void add2(String key, String value) {
        multiMap.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

}
