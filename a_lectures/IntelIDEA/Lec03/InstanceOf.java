package a_lectures.IntelIDEA.Lec03;

import a_lectures.IntelIDEA.Lec03.Record;

public class InstanceOf {
    public static void main(String[] args) {
        Record.Point p = new Record.Point(3, 4);
        processNew(p);

    }
    // есть исключение с null
    // null будет false, но легко скастуется.

    private static void process(Object obj) {
        if (obj instanceof Record.Point) {
            Record.Point point = (Record.Point) obj;
            point.print();
        }
    }
    // В новой версии Java (16+) можно вот так
    private static void processNew(Object obj) {
        if (obj instanceof Record.Point point) {
            point.print();
        }
    }
}
