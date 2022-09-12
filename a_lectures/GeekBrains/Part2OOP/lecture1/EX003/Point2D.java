package a_lectures.GeekBrains.Part2OOP.lecture1.EX003;

/**
 * Это точка 2D
 * */
public class Point2D {
    private int x, y; // теперь это поле, а не переменная

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Это конструктор
     * @param valueX это координата X
     * @param valueY это координата Y
     * */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
//    public Point2D() {
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value) {
//        x = value;
//        y = value;
//    }
// переопределили предыдущие два метода в один
    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }
    // переопределение метода
    @Override
    public String toString() {
        return getInfo();
    }

    public void  setX(int value) {
        this.x = value;
    }
    public void  setY(int value) {
        this.y = value;
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
