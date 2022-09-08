package a_lectures.IntelIDEA.Lec04.Interface;

/**
 * после добавления абстрактного класса расширяеся от абстракта
 */
//public class FieldVector implements Vector {
// а потом запечатаем и сделаем их final
public final class FieldVector extends AbstractVector {
    double x, y, z;

    FieldVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double component(int n) {
        return switch (n) {
            case 0 -> x;
            case 1 -> y;
            case 2 -> z;
            default -> throw new IllegalArgumentException();
        };
    }

    @Override
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public Vector plus(Vector other) {
        return null;
    }

    @Override
    public String toString() {
        return "field: (" + x + ", " + y + ", " + z + ")";
    }
}
