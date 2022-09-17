package a_lectures.IntelIDEA.Lec06;

import java.util.Iterator;

public class Ex01_Iterable {


    public static void main(String[] args) {

    }

    void printAll1(java.lang.Iterable<?> iterable) {
        Iterator<?> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    // упрощенный вариант в новых джавах
    void printAll2(java.lang.Iterable<?> iterable) {
        for (Object obj : iterable) {
            System.out.println(obj);
        }
    }

    void removeEmpty(Iterable<String> iterable) {
        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()){
            if (iterator.next().isEmpty()) {
                iterator.remove();
            }
        }
    }

}
