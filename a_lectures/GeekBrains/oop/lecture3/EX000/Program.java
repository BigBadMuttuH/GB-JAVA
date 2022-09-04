package a_lectures.GeekBrains.oop.lecture3.EX000;

public class Program {
    public static void main(String[] args) {
//      создать экземпляр абстрактного класса и переписать его методы(абстрактные)
        Foo foo1 = new Foo() {
            @Override
            public void m1() {
                System.out.println("m1()");
            }

            @Override
            public void m2() {
                System.out.println("m2()");
            }
        };

        foo1.m1();
        foo1.m2();

        Foo foo2 = new Foo() {
            @Override
            public void m1() {
                System.out.println(">>>>m1()");
            }

            @Override
            public void m2() {
                System.out.println(">>>>m2()");
            }
        };

        foo2.m1();
        foo2.m2();
    }
}
