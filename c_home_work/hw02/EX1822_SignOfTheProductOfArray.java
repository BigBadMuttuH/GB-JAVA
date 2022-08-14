package c_home_work.hw02;

public class EX1822_SignOfTheProductOfArray {
    public static void main(String[] args) {
        int[] nums1 = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums1));
        int[] nums2 = {1,5,0,2,-3};
        System.out.println(arraySign(nums2));
        int[] nums3 = {-1,1,-1,1,-1};
        System.out.println(arraySign(nums3));

    }
    public static int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num > 0) {
                result *= 1;
            } else {
                result *= -1;
            }
        }
        return result;
    }
}
