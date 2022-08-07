package c_home_work.hw01;
//    https://leetcode.com/problems/remove-element/

import java.util.Arrays;

public class EX0027_RemoveElements {
    public static void main(String[] args) {
        int[] n = {3,2,2,3};
        int val = 3;

        System.out.println(Arrays.toString(n));
        int k = removeElement(n, val);
        System.out.printf("value=%d meets=%d times!\n", val, k);
        System.out.println("return array=" + Arrays.toString(n));

    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
//        int[] expectedNums = new int[nums.length];
        // идея в том, чтобы скопировать в текущий массив
        // все значения, которы не равны искомой величине за один проход

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
//        System.arraycopy(expectedNums, 0, nums, 0, nums.length);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(k);
        return k;
    }
}
