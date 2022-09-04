package a_lectures.GeekBrains.oop.lecture2.EX000;

public class Foo {
    public Integer value;

    public static Integer count;

    public static Integer getCount() {
        return count; // никаких х this тут не надо, так как это статика.
    }

    static {
        count = 0;
    }

    public Foo() {
        count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
