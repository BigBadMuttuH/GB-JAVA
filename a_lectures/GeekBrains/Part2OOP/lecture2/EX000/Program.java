package a_lectures.GeekBrains.Part2OOP.lecture2.EX000;

public class Program {

    void A(){
        System.out.println("A()");
    }

    public static void main(String[] args) {

        Program pr = new Program();
        pr.A();

        Foo f1 = new Foo();
        f1.value = 123;
        System.out.println(f1.value);
        f1.printCount();

//        Foo.count = 123_000;

        Foo f2 = new Foo();
        f2.value = 223;
        System.out.println(f2.value);
        f2.printCount();


        Foo f3 = new Foo();
        f3.value = 666;
        System.out.println(f3.value);
        f3.printCount();

    }
}
