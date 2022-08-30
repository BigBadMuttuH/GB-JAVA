package a_lectures.GeekBrains.oop.lecture1.EX003;

public class OOP0003 {


    public static void main(String[] args) {

        Point2D a = new Point2D(0, 2);
//        System.out.println(a.getInfo());
        System.out.println(a);
        System.out.println(a.getX() + ", " + a.getY());

        Point2D b = new Point2D();
//        b.x = 0;
//        b.y = 10;
        b.setX(0);
        b.setY(10);
        System.out.println(b);

        Point2D c = new Point2D(10);
        System.out.println(c);


//        System.out.println(distance(a, b));
//        System.out.println(distance(a, c));
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
