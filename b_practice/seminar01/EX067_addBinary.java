//https://leetcode.com/problems/add-binary/
package b_practice.seminar01;

public class EX003_addBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("10110", "111"));
        System.out.println(addBinary("111", "111"));
        System.out.println(addBinary("11111110010101", "1010101010"));

    }
    public static String addBinary(String a, String b) {
        int x = a.length() - 1;
        int y = b.length() - 1;
        int carrier = 0;
        String result = "";
        while (x >= 0 || y >= 0) {
            int aa = x >= 0 ? Integer.parseInt(String.valueOf(a.charAt(x))) : 0;
            int bb = y >= 0 ? Integer.parseInt(String.valueOf(b.charAt(y))) : 0;
            int sum = aa + bb;
            // sum = 0, 1, !2
            if (sum == 2 && carrier == 1) {
                sum = 1;
            } else if (sum == 2 && carrier == 0) {
                sum = 0;
                carrier = 1;
            } else if (sum == 1 && carrier == 1) {
                sum = 0;
            } else if (sum == 0 && carrier == 1) {
                sum = carrier;
                carrier = 0;
            }
            x--;
            y--;
            result = String.valueOf(sum) + result;
//            System.out.printf(result);
        }
        // на тот случай, если все закончиться и останиться свободный разраяд
        if (carrier == 1) return "1" + result;
        return result;
    }
}
