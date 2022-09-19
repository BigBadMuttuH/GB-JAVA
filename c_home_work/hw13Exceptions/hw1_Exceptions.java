package c_home_work.hw13Exceptions;


import java.util.Arrays;

public class hw1_Exceptions {
    public static void main(String[] args) {
//        String s = null;
//        System.out.println(getLength(s));
//        s = "123FA";
//        System.out.println(getInt(s));;
//        test();
        int[] a1 = new int[]{1, 2, 4};
        int[] a2 = new int[]{5, 5, 6, 0, 8};
        int[] b1 = new int[]{1, 2, 4};
        int[] b2 = new int[]{5, 0, 6};
        System.out.println(Arrays.toString(sumArrays(a1, a2)));
        System.out.println(Arrays.toString((divArrays(a1, a2))));
        System.out.println("-".repeat(40));
        System.out.println(Arrays.toString(sumArrays(b1, b2)));
        System.out.println(Arrays.toString((divArrays(b1, b2))));
    }

    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    // NullPointException
    public static int getLength(String str) {
        return str.length();
    }

    // NumberFormatException
    public static int getInt(String str) {
        return Integer.parseInt(str);
    }

    //StackOverflowError
    public static void test() {
        test();
    }

    // Задача 3.
    public static int[] sumArrays(int[] a, int[] b) {
        int size = a.length;
        if (a.length != b.length) {
            size = Math.min(a.length, b.length);
            throw new IndexOutOfBoundsException("Длинны массивов не равны: " + a.length + " != " + b.length);
//            System.out.println("Длинны массивов не равны: " + a.length + " != " + b.length);
//            System.out.println("Считаем по длине наименьшего массива");
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }

    // Задача 4.
    public static double[] divArrays(int[] a, int[] b) {
        int size = a.length;
        if (a.length != b.length) {
            size = Math.min(a.length, b.length);
            throw new IndexOutOfBoundsException("Длинны массивов не равны: " + a.length + " != " + b.length);
//            System.out.println("Длинны массивов не равны: " + a.length + " != " + b.length);
//            System.out.println("Считаем по длине наименьшего массива");
        }
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            if (b[i] == 0) {
//                System.out.println(i + " элемент массива делителей = 0");
                throw new ArithmeticException(i + " элемент массива делителей = 0");
            }
            result[i] = b[i] != 0 ? (double)a[i] / b[i] : 0;
        }
        return result;
    }
}
