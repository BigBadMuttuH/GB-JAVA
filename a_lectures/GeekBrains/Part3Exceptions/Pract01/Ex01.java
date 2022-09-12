package a_lectures.GeekBrains.Part3Exceptions.Pract01;

public class Ex01 {
    private static final int MIN_ARRAY_LENGTH;

    static {
        MIN_ARRAY_LENGTH = 5;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] b = new int[]{1, 2, 3};
        int[] c = null;
        System.out.println(message(checkArray(a, 4)));
        System.out.println(message(checkArray(a, 9)));
        System.out.println(message(checkArray(b, 4)));
        System.out.println(message(checkArray(c, 0)));

    }

    public static int checkArray(int[] arr, int item) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < MIN_ARRAY_LENGTH) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                return i;
            }
        }
        return -2;
    }

    public static String message(int m) {
        return switch (m) {
            case -1 -> "array length too small";
            case -2 -> "these i`t item in array";
            case -3 -> "null array";
            default -> String.format("index %d", m);
        };
    }
}