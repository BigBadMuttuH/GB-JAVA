package a_lectures.IntelIDEA.Lec06;

import a_lectures.IntelIDEA.Lec05.parameterization.NumberShmoption;
import a_lectures.IntelIDEA.Lec05.parameterization.Shmoption;

public class Ex00 {
    public static void main(String[] args) {
        // erasure
//        Shmoption<Integer> integer = new Shmoption<>(10);
//        Shmoption<String> string = (Shmoption<String>) integer); // ошибка
//        Shmoption<?> any = integer;
//        Shmoption<String> string2 = (Shmoption<String>) any; // предупреждение
//        String s = string2.get(); // ClassCastException

//        NumberShmoption<Integer> number = (NumberShmoption<Integer>) integer; // Нормально


        // Raw type
    //    Shmoption shmoption = new Shmoption(10);
    //    shmoption.set("foo");
    //    Object o = shmoption.get();

        // Дженерики и массивы
        //
//        Shmoption<?>[] array = new Shmoption<?>[10];
//        Shmoption<Integer>[] arrayInt = new Shmoption<Integer>[10]; // ошибка

//        Shmoption<Integer>[] arrayInt = new Shmoption[10]; // предупреждение
//        Object[] obj = arrayInt;
//        obj[0] = new Shmoption<>("foo");
//        Shmoption<Integer> shmoption = arrayInt[0];
//        Integer x = shmoption.get(); // тут нужно быть аккуратней
//        System.out.println(x);


        // Переменное число аргументов
        printAll(null, null);

    }

    static void printAll(Object... objects){
        for (Object object :
                objects) {
            System.out.println(object);
        }
    }
}
