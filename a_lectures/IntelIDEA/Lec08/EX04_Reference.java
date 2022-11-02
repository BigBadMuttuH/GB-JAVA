package a_lectures.IntelIDEA.Lec08;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EX04_Reference {
    public static void main(String[] args) {
        Predicate<String> pred = "Java"::equals;

        System.out.println(pred.test("Java"));
        System.out.println(pred.test("Kotlin"));

//      Захватывает переменную в момент выполнения
        Consumer<Object> lambdaPrinter = obj -> System.out.println(obj);
//        Вычисляется выражение слева всегда и захватывается референс
        Consumer<Object> methodRefPrinter = System.out::println;
    }
}
