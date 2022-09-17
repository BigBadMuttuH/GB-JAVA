package a_lectures.IntelIDEA.Lec06;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex02_Iterable {
    public static void main(String[] args) {

    }

    static <T> Iterable<T> nCopies1(T value, int count) throws Exception {
        if (count < 0) {
            throw new IllegalAccessException("Negative count: " + count);
        }
        return new Iterable<T>() {
            // так себе реализация
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int rest = count;

                    @Override
                    public boolean hasNext() {
                        return rest > 0;
                    }

                    @Override
                    public T next() {
                        // Так не надо делать. Лучше разделять проверки.
                        if (rest-- == 0) {
                            throw new NoSuchElementException();
                        }
                        return value;
                    }
                };
            }
        };
    }
    // Так лучше!
    static <T> Iterable<T> nCopies2(T value, int count) throws Exception {
        if (count < 0) {
            throw new IllegalAccessException("Negative count: " + count);
        }
        return () -> new Iterator<T>() { // lambda!
            int rest = count;

            @Override
            public boolean hasNext() {
                return rest > 0;
            }

            @Override
            public T next() {
                if (rest == 0) {
                    throw new NoSuchElementException();
                }
                rest--;
                return value;
            }
        };
    }
}
