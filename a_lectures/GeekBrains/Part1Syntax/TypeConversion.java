package a_lectures.GeekBrains.Part1Syntax;

public class TypeConversion {
    public static void main(String[] args) {
        int i = 123; double d = i;
        d = 1.12345; i = (int)d;
        byte b = Byte.parseByte("123");
        // b = Byte.parseByte("1234");  тут будет переполнение

        String num = "5";
        int age  = Integer.parseInt(num);
    }
}
