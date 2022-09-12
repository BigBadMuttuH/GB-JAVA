package a_lectures.GeekBrains.Part3Exceptions.Pract01;

public class Ex00 {

    private static final int MIN_ARRAY_LENGTH;

    static {
        MIN_ARRAY_LENGTH = 9;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(getMinArrayLength(a));
    }

    public static int getMinArrayLength(int[] arr) {
        int size = arr.length;
        if (size >= MIN_ARRAY_LENGTH) {
            return size;
        }
        return -1;
    }
}
