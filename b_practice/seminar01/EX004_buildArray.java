package b_practice.seminar01;


public class EX004_buildArray {
    public static void main(String[] args) {
        int[] n = {0,2,1,5,3,4};
        int[] ans = buildArray(n);
        for (int item : ans) {
            System.out.printf("%d, ", item);
        }
    }
    public static int[] buildArray (int[] nums) {
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
