package a_lectures.IntelIDEA.Lec07;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Map_Removing {
    public static void main(String[] args) {

    }
    // Такое себе решение:

    void removeUnwantedValues1(Map<String, String> map) {
        for (String key : map.keySet()) {
            String value = map.get(key);
            if (value.equals("foo") || value.equals("bar") || value.equals("baz")) {
                map.remove(key);
            }
        }
    }

    // Классический подход... старый
    void removeUnwantedValues2(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals("foo") || entry.getValue().equals("bar") ||
                    entry.getValue().equals("baz")) {
                iterator.remove();
            }
        }
    }

    // через lambda
    // намного красивее
    void removeUnwantedValues3(Map<String, String> map) {
        map.entrySet().removeIf(entry ->
                entry.getValue().equals("foo") ||
                        entry.getValue().equals("bar") ||
                        entry.getValue().equals("baz"));
    }

    // или вообще вот так
    // когда нужны только значения
    void removeUnwantedValues4(Map<String, String> map) {
        map.values().removeIf(value -> value.equals("foo") ||
                value.equals("bar") ||
                value.equals("baz"));
    }

    // а конкретно в данном случае, можно вообще вот так:
    private static final List<String> UNWANTED_VALUES = Arrays.asList("foo", "bar", "baz");

    void removeUnwantedValues5(Map<String, String> map) {
        map.values().removeAll(UNWANTED_VALUES);
    }
}
