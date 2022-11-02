package a_lectures.IntelIDEA.Lec08;

import java.util.function.IntSupplier;

public class EX02_Lambda {
    public static void main(String[] args) {
        IntSupplier l1 = () -> 5;
//         так недопустимо
//        IntSupplier l0 -> System.out.println();

//         так недопустимо
//        Runnable l2 = () -> 5;
//        так работает
        Runnable l3 = () -> System.out.println("!");

        IntSupplier l4 = () -> {
            throw new RuntimeException();
        };
        Runnable r1 =() -> {
            throw new RuntimeException();
        };

//        захват переменных
        int x = 5;
        IntSupplier l5 = () -> x * x;

//        так уже нельзя - нельзя менять локальную переменную
//        int x = 5;
//        x++;
//        IntSupplier l5 = () -> x * x;
    }
}
