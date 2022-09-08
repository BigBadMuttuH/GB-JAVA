package a_lectures.IntelIDEA.Lec04.Interface;

// после добавления абстрактного класса унаследуемя от абстракта
//public class ZeroVector implements Vector{
// а потом запечатаем и сделаем их final
public final class ZeroVector extends AbstractVector {
    public static final ZeroVector INSTANCE = new ZeroVector();

    // чтобы ни кто не мог создать кучу нулевых векторов
    private ZeroVector() {};

    @Override
    public double component(int n) {
        return 0;
    }

    @Override
    public double length() {
        return 0;
    }

    @Override
    public Vector plus(Vector other) {
        return other;
    }

    @Override
    public String toString() {
        return "zero: (0, 0, 0)";
    }
}
