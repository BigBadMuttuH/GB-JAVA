package a_lectures.IntelIDEA.Lec04.Interface;

/**
 * Represents an immutable 3D-vector
 */
// Запечатаем класс
sealed interface Vector permits AbstractVector {
//public interface Vector {

    /**
     * Returns a vector component
     *
     * @param n component number, must be 0 (x), 1 (y) or 2 (z)
     * @return a value of the corresponding vector component
     */
    double component(int n);

//    /**
//     * @return a vector length
//     * */
//    double length();

    /**
     * Sums two vectors
     *
     * @param other a vector to add to this vector
     * @return a result of addition
     */
    Vector plus(Vector other);


    /**
     * Returns a string representation of vector,
     * which looks like (X, Y, Z)
     */
    @Override
    String toString();

    // еще полезная штука - default метод

    /**
     * @return a vector length
     */
    default double length() {
        double x = component(0);
        double y = component(1);
        double z = component(2);
        return Math.sqrt(x * x + y * y + z * z);
    }

    // и фабричный метод

    /**
     * Return a vector having the supplied components.
     *
     * @param x
     * @param y
     * @param z
     * @return a vector
     */
    static Vector of(double x, double y, double z) {
        if (x == 0 && y == 0 && z == 0) {
            return ZeroVector.INSTANCE;
        }
        return new ArrayVector(x, y, z);
    }

    // ещё можно избавиться от ZeroVector - создадим анонимный класс
//    Vector ZERO = new AbstractVector() {
//        @Override
//        public double component(int n) {
//            return 0;
//        }
//
//        @Override
//        public double length() {
//            return 0;
//        }
//
//        @Override
//        public Vector plus(Vector other) {
//            return other;
//        }
//
//        @Override
//        public String toString() {
//            return "(0, 0, 0)";
//        }
//    };
}
