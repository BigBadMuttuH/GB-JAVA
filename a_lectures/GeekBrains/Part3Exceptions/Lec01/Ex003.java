package a_lectures.GeekBrains.Part3Exceptions.Lec01;

public class Ex003 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide (int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("divide by zero");
        }
        return a1 / a2;
    }
}
