package a_lectures.IntelIDEA.Lec08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;

public class EX03_Lambda {
    static int x =5;

    public static void main(String[] args) {
//        int x = 5;
        List<IntSupplier> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            x++;
            // Тут будет ошибка! Если x объявлен внутри метода.
//            IntSupplier l1 = () -> x * x;
            // Нельзя менять переменную (см. ни кто не может покуситься на вашу переменную)
            // Нужно создать еще одну для захвата
            int xx = x;
            IntSupplier l1 = () -> xx * xx;
            list.add(l1);
        }
        for (IntSupplier intSupplier : list) {
            System.out.println(intSupplier.getAsInt());
        }
    }
}
