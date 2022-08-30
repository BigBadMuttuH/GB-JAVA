package a_lectures.GeekBrains;

public class DataTypes {
    public static void main(String[] args){
        DatesTypes();
        StringExamples();

        var a = 123;
        System.out.println(getType(a));
        var b = 123.456;
        System.out.println(getType(b));


        // логические оперторы
        // || - коньюнкция,
        // && - дизюнкция,
        // ^ - разделительная дизюнкция,
        // ! - инверсия.

        // побитовые операции
        // << - побитовый сдвиг
        // >> - побитовый сдвиг
        // возможно потребуется для оптимизации
        // & - и
        // | - или
        // ^ - разделительное или
        ByteShifts();
    }
    public static void DatesTypes(){
        // типы данных
        // все как в C#. ну почти.
        String s = null;
        s = String.valueOf('5');
        System.out.println(s);
        int x = 1_123_234;
        double y = x;

        System.out.println(x++); //смотри тут внимательно!!!
        System.out.println(x);
        System.out.println(++x); //смотри тут внимательно!!!

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        short age = 10;
        int salary = 123456;
        float e = 2.7f; //тут f - обязательна
        double pi = 3.1415;
        char chr = '1';
        System.out.println(Character.isDigit(chr));
        chr = 'a';
        System.out.println(Character.isDigit(chr));
        boolean flag1 = 123 <= 456;
        System.out.println(flag1);
        boolean flag2 = flag1; // ||-это или
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2; // дизюнкция
        System.out.println(flag3);
    }
    
    public static void StringExamples() {
        String msg = "Hello world";
        System.out.println(msg);
        String s = "qwerty113";
        System.out.println(s.charAt(0));
    }

    public static void ByteShifts() {
        int a = 8;
        // 1000 - в байтах
        System.out.println(a << 1);
        // 10000 - это 16 в двоичном исчислении

        int x = 5;
        int y = 2;
        System.out.println(x | y);
        // 101
        // 010
        //______
        // 111
        // это будет 7
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
