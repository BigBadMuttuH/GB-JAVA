package a_lectures.GeekBrains.Part3Exceptions.Lec03;
// try-with-res

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex00 {
    public static void main(String[] args) {
        // чтобы все идеально работало, нужно наследоваться от AutoCloseable
        try (
                FileReader fileReader = new FileReader("D:\\DOC\\test.txt");
                FileWriter fileWriter = new FileWriter("D:\\DOC\\test1.txt");
//                String test = "text" // String не AutoCloseable
        ) {
            while (fileReader.ready()) {
                fileWriter.write(fileReader.read());
            }
            // так можно перечислять исключения
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        try {
            System.out.println("test operation");
        } finally {
            System.out.println("finally operation");
        }
    }
}