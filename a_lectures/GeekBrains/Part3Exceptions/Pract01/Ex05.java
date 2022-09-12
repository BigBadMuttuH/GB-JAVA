package a_lectures.GeekBrains.Part3Exceptions.Pract01;

import java.util.HashMap;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) {
        Integer[] a = new Integer[] {1, null, 3, 4, null, 6};
        checkArray(a);
    }


    public static void checkArray(Integer[] arr) {
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.put(i, String.format("null on index %d, err code %d", i, 0));
            }
        }
        System.out.println(result.values());
    }
}
