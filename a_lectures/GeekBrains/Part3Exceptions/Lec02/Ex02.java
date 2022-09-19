package a_lectures.GeekBrains.Part3Exceptions.Lec02;

import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("Ex00.java");
            test.read();
            // так можно перечислять исключения
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close file");
                }
            }
            System.out.println("finally End");
        }
    }
}
