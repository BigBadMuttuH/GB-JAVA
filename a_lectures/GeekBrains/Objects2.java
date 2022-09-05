package a_lectures.GeekBrains;

public class Objects2 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0, 2));
        System.out.println(sum(1, 2.0));
        System.out.println(sum(1.2, 2.1));
    }
    static Object sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double){
            return (double) a + (double) b;
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Integer) a + (Integer) b;
        } else return 0;
    }

}
