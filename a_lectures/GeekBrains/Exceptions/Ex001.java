package a_lectures.GeekBrains.Exceptions;

import java.io.File;

public class Ex001 {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("123")));
        System.out.println(getFileSize(new File("D:\\-GeekBrains-\\КтоТЫ.jpg")));


        System.out.println(divide(10, 0));
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at a_lectures.GeekBrains.Exceptions.Ex001.divide(Ex001.java:19)
//        at a_lectures.GeekBrains.Exceptions.Ex001.main(Ex001.java:11)

    }

    public static int divide(int a1, int a2) {
//        if (a2 == 0) {
//            // -1 не прокатить, а вдруг будет -10/10
//            return -1;
//        }
        return a1 / a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }

}
