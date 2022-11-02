package a_lectures.IntelIDEA.Lec08;

public class EX01_Runnable {
    public static void main(String[] args) {
        Runnable r =() -> System.out.println("Hello World!");
        r.run();
//        static void run(Runnable r) {r.run();}
        run(() -> System.out.println("Hello world!"));

//      так тоже можно, но не всегда работает
        Object x = (Runnable)(() -> System.out.println("Hello world!"));

//      вариант выглянуть наружу
        Runnable r2 = (args.length > 0 ?
                () -> System.out.println("Hello " + args[0] + "!") :
                () -> System.out.println("Hello World!"));

        r2.run();
//      а вот так уже работать не будет.
//        Object x2 = (Runnable)(args.length > 0 ?
//                () -> System.out.println("Hello " + args[0] + "!") :
//                () -> System.out.println("Hello World!"));

    }
    // ну или объявив отдельно
    static void run(Runnable r) {r.run();}
}
