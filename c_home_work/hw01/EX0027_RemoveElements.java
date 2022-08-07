package c_home_work.hw01;
//    https://leetcode.com/problems/remove-element/

import java.util.Arrays;

public class EX0027_RemoveElements {
    public static void main(String[] args) {
        int[] n = {3,2,2,3};
        int val = 3;

        System.out.println(Arrays.toString(n));
        int k = removeElement(n, val);
        System.out.println(k);
        System.out.println(Arrays.toString(n));

    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);

        return k;
    }
}
