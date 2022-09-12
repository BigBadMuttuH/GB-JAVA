package a_lectures.GeekBrains.Part3Exceptions.Pract01;

public class Ex0 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int b = 8;

        System.out.println(getArray(a, b));

    }

    public static int getArray(int[] arr, int min) {
        int size = arr.length;
        if (size < min) {
            throw new ArrayStoreException("To small array");
//            return -1;
        } else {
            return size;
        }
    }
}
