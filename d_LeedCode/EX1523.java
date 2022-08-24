public class EX1523 {
    public static void main(String[] args) {
        System.out.println(countOdds(3,7));
        System.out.println(countOdds(8,10));
        System.out.println(countOdds(3,10));

    }
    public static int countOdds(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low ) / 2;
        } else if (low % 2 != 0 && high % 2 != 0) {
            return (high - low ) / 2 + 1;
        } else {
            return ( high - low + 1) / 2;
        }
    }
    public int countOdds1(int low, int high) {
        int count = (high - low + 1) / 2;
        if (low % 2 == 1 && high % 2==1)
        {
            count++;
        }
        return count;
    }
}
