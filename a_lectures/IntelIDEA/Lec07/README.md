# Map, hashcode, компараторы

Queue<E> extends Collection<E>
- offer/add
- poll/remove
- peek/element (Возвращают null/false, если не вышло)

Deque<E> extends Queue<E>
- offerFist/addFirst
- offerLast/addLast
- pollFirst/removeFirst
- pollLast/removeLast
- peekFirst/getFirst
- peekLast/getLast

Стандартные очереди:
- ArrayDeque - изменяемая очередь общего назначения
- PriorityQueue - изменяемая очередь с приоритетом (heap-based)

Не надо использовать!
- Enumeration -> Iterator;
- Vector -> ArrayList;
- Stack -> ArrayDeque;
- Dictionary -> Map;
- Hashtable -> HashMap;
- LinkedList -> ArrayList/ArrayDeque;

### Map
![map](map0.png "Map")
![map](map1.png "Map")
![map](map2.png "Map")
![map](map3.png "Map")
![map](map4.png "Map")
![map](map5.png "Map")

### hashCode
![hashCode](hashCode1.png "HashCode")
- почему на 31? (операция быстрая, чем умножение в среднем)
- потому что при умножении на 31 нужно сдвинуть на 5 бит (32), а потом вычесть само число
![hashCode](hashCode2.png "HashCode")

### Comparable
![comparable](comparable1.png "comparable")
![comparable](comparable2.png "comparable")

### Comparator
![comparator](comparator1.png "comparator")
![comparator](comparator2.png "comparator")



