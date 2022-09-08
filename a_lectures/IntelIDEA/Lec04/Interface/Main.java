package a_lectures.IntelIDEA.Lec04.Interface;

public class Main {
    public static void main(String[] args) {
        Vector v1 = ZeroVector.INSTANCE;
        Vector v2 = new ArrayVector(1, 2, 3);
        Vector v3 = new FieldVector(4, 5, 6);

        Vector sum = v1.plus(v2).plus(v3);
//        System.out.println(sum.component(0) + ", " +
//                sum.component(1) + ", " +
//                sum.component(2));
        System.out.println(sum);
    // всё круто, но как сравнить два вектора?
    // изи - алт+инсерт - автогенерация

    // Но!, такая реализация так себе в нашем случае.
    // Тут нужно задуматься, так как у нас разные реализации векторов.
    // Делаем по своему. ArrayVector.

        Vector zero1 = ZeroVector.INSTANCE;
        Vector zero2 = new ArrayVector(0, 0, 0);
        Vector zero3 = new FieldVector(0, 0, 0);
        System.out.println(zero2.equals(zero1)); // true
        System.out.println(zero2.equals(zero3)); // true
        System.out.println(zero1.equals(zero2)); // false
        // Так получается, что метод equals не реализовали в ZeroVector
        // да еще должно быть всё совместимо, с ArrayVector и FieldVector.
        // Тут поможет абстрактный класс.
    }
}
