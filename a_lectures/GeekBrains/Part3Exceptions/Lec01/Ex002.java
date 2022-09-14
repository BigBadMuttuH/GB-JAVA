package a_lectures.GeekBrains.Part3Exceptions.Lec01;

public class Ex002 {
    public static void main(String[] args) {
        // stack tracer
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1000 out of bounds for length 10
//        at a_lectures.GeekBrains.Exceptions.Ex002.c(Ex002.java:18)
//        at a_lectures.GeekBrains.Exceptions.Ex002.b(Ex002.java:14)
//        at a_lectures.GeekBrains.Exceptions.Ex002.a(Ex002.java:11)
//        at a_lectures.GeekBrains.Exceptions.Ex002.main(Ex002.java:8)
        a();
    }
    public static void a() {
        b();
    }
    public static void b() {
        c();
    }
    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1_000]);
    }
    // работа исключений выгоднее, чем работать с кодами ошибок!
}
