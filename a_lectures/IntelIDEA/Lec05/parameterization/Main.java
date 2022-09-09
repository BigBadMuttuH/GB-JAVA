package a_lectures.IntelIDEA.Lec05.parameterization;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Shmoption<String> present = new Shmoption<>("yes");
        Shmoption<String> absent = new Shmoption<>(null);
        System.out.println(present.isPresent());
        System.out.println(present.get());
        System.out.println(absent.isPresent());
        System.out.println(absent.orElse("no"));

        // c var нужно быть аккуратней
        var present1 = new Shmoption<>("yes");
        var absent1 = new Shmoption<>(null);
        System.out.println(present1.orElse("no").length());
        // тут будет проблема!!! с var не надо так!
//        System.out.println(absent1.orElse("no").length());

        // ? - маскировочный символ,  wildcard
        Shmoption<?> present2 = new Shmoption<>("yes");
        System.out.println(present2.isPresent());
        System.out.println(present2.get());

        Object value = present2.get();
        System.out.println(value);
        // capture of ? newValue
//        present2.set(???);
        // хотя вот так можно
        present2.set(null);

        Shmoption<? extends Number> number = new Shmoption<>(123);
        // так не сработает1
//        Number n = new number.get();
//        number.set(124);

        NumberShmoption<?> number1 = new NumberShmoption<>(123);
        Number n1 = number1.get();
        // снова не перокатит
//        number1.set(124);

       NumberShmoption.IntegerShmoption integer = new NumberShmoption.IntegerShmoption(123);
       Integer i = integer.get();
       integer.set(124);

       // надтип
       number1 = integer;

    }
}
