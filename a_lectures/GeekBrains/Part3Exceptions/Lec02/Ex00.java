package a_lectures.GeekBrains.Part3Exceptions.Lec02;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Ex00 {
    public static void main(String[] args) {

//NullPointerException
        String name = null;
        System.out.println(name.length());

//ClassCastException
        Object obj = new String("123");
        File file = (File) obj;
        System.out.println(file);

//NumberFormatException
        String namber = "123fq";
        int a = Integer.parseInt(namber);
        System.out.println(a);

//UnsupportedOperationException
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
