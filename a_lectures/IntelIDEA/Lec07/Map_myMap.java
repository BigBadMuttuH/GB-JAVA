package a_lectures.IntelIDEA.Lec07;


import java.util.*;

public class Map_myMap {
    public static void main(String[] args) {

    }

    static Map<Integer, String> getIntegerToStringMap(int count) {
        return new AbstractMap<>() {
            // в такой мап хорошо бы создать методы получения ключей и
            @Override
            public boolean containsKey(Object key) {
                return key instanceof Integer && ((Integer) key) >= 0 &&
                        ((Integer) key) < count;
            }

            @Override
            public String get(Object key) {
                return containsKey(key) ? key.toString() : null;
            }


            public Set<Entry<Integer, String>> entrySet() {
                return new AbstractSet<>() {
                    public Iterator<Entry<Integer, String>> iterator() {
                        return new Iterator<>() {
                            int next = 0;

                            public boolean hasNext() {
                                return next < count;
                            }

                            public Entry<Integer, String> next() {
                                if (next == count) throw new NoSuchElementException();
                                return new AbstractMap.SimpleImmutableEntry<>(
                                        next, String.valueOf(next++));
                            }
                        };
                    }

                    public int size() {
                        return count;
                    }
                };
            }
        };
    }

    ;

}
