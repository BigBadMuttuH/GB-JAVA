package a_lectures.IntelIDEA.Lec05.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause){
        super(message, cause);
    }

    void readFile() throws Test.MyException {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get("/etc/passwd"));
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            try {
                throw new MyException("Unable to read file");
            } catch (MyException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
