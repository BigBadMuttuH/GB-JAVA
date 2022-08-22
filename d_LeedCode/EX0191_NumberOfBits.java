package d_LeedCode;

public class EX0191_NumberOfBits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00_000_000_000_000_000_000_000_000_001_011));
        System.out.println(hammingWeight(00_000_000_000_000_000_000_000_010_000_000));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 31; i >= 0 ; i--) {
           int bitmask = ( 1 << i);
           if (( n & bitmask) != 0 ) count++;
        }
        return count;
    }
}
