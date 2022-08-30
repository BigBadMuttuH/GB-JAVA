package a_lectures.GeekBrains.oop.lecture1.EX002;

public class OOP0002 {
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {

        Point2D a = new Point2D();
        a.x = 0;
        a.y = 2;
        System.out.println(a);

        Point2D b = new Point2D();
        b.x = 0;
        b.y = 2;
        System.out.println(b);

        System.out.println(distance(a, b));
    }
}
