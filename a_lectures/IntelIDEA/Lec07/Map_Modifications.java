package a_lectures.IntelIDEA.Lec07;

import java.util.Map;

public class Map_Modifications {
    public Map_Modifications() {
    }// Модификация

    // так можно, но не эффективно
    // два раза смотрим в Map
    void trimAllValuesE(Map<String, String> map) {
        for (String key : map.keySet()) {
            String value = map.get(key);
            map.put(key, value.trim());
        }
    }// Уже лучше

    void trimAllValues1(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            entry.setValue(entry.getValue().trim());
        }
    }// Совсем хорошо

    void trimAllValues2(Map<String, String> map) {
        map.replaceAll((key, value) -> value.trim());
    }
}