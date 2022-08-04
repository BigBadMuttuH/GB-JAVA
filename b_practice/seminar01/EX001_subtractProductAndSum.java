//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
package b_practice.seminar01;

class EX001_subtractProductAndSum {
    public static void main(String[] args) {
        int x = subtractProductAndSum(15);
        System.out.println(x);
    }

    public static int subtractProductAndSum(int n) {
        int productOfDigits = 1;
        int sumOfDigits = 0;
        while (n > 0){
            productOfDigits *= n % 10;
            sumOfDigits += n % 10;
            n = Math.abs(n / 10);
        }
        return productOfDigits - sumOfDigits;
    }
}
