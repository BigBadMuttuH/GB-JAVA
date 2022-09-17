package a_lectures.IntelIDEA.Lec06;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Ex03_Set {
    public static void main(String[] args) {
        System.out.println(rangeSet1(10, 20).contains(10));
        System.out.println(rangeSet1(10, 20).contains(30));
        System.out.println(rangeSet1(10, 20));
        // вот такое буде работать очень долго
        System.out.println(rangeSet1(0, Integer.MAX_VALUE).contains(-1));
        // так что, в идеале нужно еще реализовать свой метод contains
        // с
        Set<Integer> a = Set.of(1, 2, 3, 4);
    }

    //Set
    static Set<Integer> rangeSet1(int fromInclusive, int toExclusive) {
        return new AbstractSet<Integer>() {

            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    int next = fromInclusive;

                    public boolean hasNext() {
                        return next != toExclusive;
                    }

                    public Integer next() {
                        if (next == toExclusive) {
                            throw new NoSuchElementException();
                        }
                        return next++;
                    }
                };
            }

            public int size() {
                return toExclusive - fromInclusive;
            }

            @Override
            public boolean contains(Object o){
                return o instanceof Integer &&
                        ((Integer) o) >= fromInclusive &&
                        ((Integer) o) < toExclusive;
            }
        };
    }
}