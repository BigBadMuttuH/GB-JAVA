package b_practice.seminar02;

public class EX0001_Pow {
    public static void main(String[] args) {
        System.out.println(power(3, 2));
        System.out.println(power(2, -2));
        System.out.println(power(3, 3));
        System.out.println(power(3, 0));
        System.out.println(power(0, 0));
    }

    /**
     * 2^6 = 2 * 2 * 2 * 2 * 2  = 64
     * 2^6 = 2^3*2^3
     * 2^5 = 2^2*2^2*2
     */
    public static double power(double a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        if (b < 0) return power(1 / a, -b);
        double c = 1;
        if (b % 2 != 0) c = a;
        return power(a, b / 2) * power(a, b / 2) * c;
    }
}
