package b_practice.seminar02;


public class EX0002_tree {

    public static void main(String[] args) {
        finePath(1, 7, 2, 1, "");

    }

    public static void finePath(int a, int b, int c, int d, String result) {
        if (a > b) {
            return;
        }
        if (a == b) {
            System.out.println(result);
            return;
        }
        finePath(a * c, b, c, d, result + "k1(*2)-");
        finePath(a + d, b, c, d, result + "k2(+1)-");
    }
}

