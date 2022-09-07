package b_practice.seminarOOP04.Ex001;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hi");
        stringBox.showType();
        System.out.println("stringBox.getObject(): " + stringBox.getObject());

        Box<Integer> integerBox = new Box<>(10);
        integerBox.showType();
        System.out.println("IntegerBox.getObject(): " + stringBox.getObject());
    }
}
