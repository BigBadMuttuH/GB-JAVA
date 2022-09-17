package a_lectures.IntelIDEA.Lec06;


import e_algoritms.part001.In;

import java.util.*;

public class Ex04_List {
    public static void main(String[] args) {

    }

    // достаточно переопределить методы get и size
    static List<Integer> rangeList(int fromInclusive, int toExclusive) {
        return new ArrayList<>() {

            @Override
            public Integer get(int index) {
                if (index < 0 || index >= size())
                    throw new IndexOutOfBoundsException(index);
                return fromInclusive + index;
            }

            @Override
            public int size() {
                return toExclusive - fromInclusive;
            }
        };
    }

//    public static <T> int binarySearch(List<? extends T> list, T key,
//                                       Comparator<? super T> c) {
//        if (c == null) {
//            return binarySearch((List<? extends Comparable<? super T>>) list, key);
//        }
//        if (list instanceof RandomAccess || list.size()<BINARYSEARCH_THRESHOLD) {
//            return Collections.indexBinarySearch(list, key, c);
//        }else {
//            return Collections.iteratorBinarySearch(list, key, c);
//        }
//    }
//    // чтобы это все работало, нужно объявить свой класс RangeList вот так:
//    private static class RangeList extends AbstractList<Integer> implements RandomAccess{
//
//        @Override
//        public Integer get(int index) {
//            return null;
//        }
//
//        @Override
//        public int size() {
//            return 0;
//        }
//    }
}
