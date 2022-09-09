package a_lectures.IntelIDEA.Lec05.Exceptions;

public class Test {
    static class MyException extends Exception {

    }

    static void test() throws MyException {
        throw new MyException();
    }

//    public static void main(String[] args) throws MyException {
//        test();
//    }

    // обрабатываем исключения самостоятельно
    public static void main(String[] args) {
        try {
            test();
        }
        catch (MyException ex) {
            ex.printStackTrace();
        }
    }
}
