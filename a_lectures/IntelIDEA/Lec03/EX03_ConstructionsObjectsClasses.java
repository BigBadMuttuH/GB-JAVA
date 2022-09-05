// Лекция 3. Управляющие конструкции, объекты, классы
package a_lectures.IntelIDEA.Lec03;

import e_algoritms.part001.In;

import java.util.Random;

/**
 * Управляющие конструкции: if, switch, while, do..while, for, for-each, break, continue, yield, return
 */
public class EX03_ConstructionsObjectsClasses {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(-1, 1);
        if (x > 0) {
            System.out.println("x positive");
        } else if (x == 0) {
            System.out.println("x = zero");
        } else {
            System.out.println("x negative");
        }
        // условный оператор (выражение) тернарный оператор.
        System.out.println(x > 0 ? "positive" : "negative or zero");
        // опасайтесь анбоксинга! используйте одинаковый тип в ветках!
        Double a = 1.0;
        Integer b = 2;
        Number n = false ? a : b;
        System.out.println(n); // 2.0 - тут вдруг неожиданно будет Double!

        // Метки: целые числа (включая char), строки, перечисления.
        // Новый switch (работает с 14 Java)
        switch (x) {
            case 1 -> System.out.println("positive");
            case -1, 0 -> System.out.println("negative or zero");
            default -> {
                System.out.println("other");
                System.out.println(x);
            }
        }
        // и еще вот так можно!
        System.out.println(switch (x) {
            case 1 -> "positive";
            case -1 -> "negative";
            default -> "zero"; // default должен обязателен!!!!
        });

        // while
//        System.out.println("Type 'exit' ot exit");
//        // подозрительно!
//        while (!System.console().readLine().contains("exit"));

        // for - классика. Условие - тело - обновление
        //   for(;;) {};  // бесконечный цикл. while(true){};
        // можно вот так, но нет смысла, Java умная, сама это сделает.
        for (int i = 0, length = args.length; i < length; i++) {
            String arg = args[i];
            System.out.println(arg);
        }

        // break - короткое замыкание
        boolean found = false;
        for (String arg : args) {
            if (arg.equals("Waldo")) {
                found = true;
                break;
            }
        }
        // также можно выйти из switch
        // brake LABEL - можно так, но лучше не надо!
//        int[][] matrix = getMatrix();
//        OUTER:
//        for....
//            brake OUTER:


       // continue - в switch не работает.
        int goodArgs = 0;
        for (String arg : args) {
            if (arg.contains("bad")) {
                continue;
            }
            goodArgs++;
        }
        System.out.println("Found" + goodArgs + " good arguments.");
    }
}