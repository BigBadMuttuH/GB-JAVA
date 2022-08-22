package a_lectures.GeekBrains;


import java.util.*;

public class LinkedList_and_Queue {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        // очередь построенная на LinkedList
        Queue<Integer> qq = new LinkedList<Integer>();

        qq.add(1);
        qq.add(2);
        qq.add(3);

        // удалить элемент
        int item = qq.remove();

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(1);
        pq.add(4);
        System.out.println(pq);
        // Извлекается вот так.
        // Наименьший приоритет имеет наивысшее значение.
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        // Deque, линейная коллекция, которая поддерживает вставку и удаление
        // элементов на обоих концах
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1); dq.addLast(2);
    }
}