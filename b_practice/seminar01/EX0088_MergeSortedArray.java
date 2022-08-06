package b_practice.seminar01;
//  https://leetcode.com/problems/merge-sorted-array/

import java.util.Objects;

public class EX0088_MergeSortedArray {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,0,0,0};
        int[] b1 = {2,5,6};
        int m1 = 3, n1 = 3;
        merge2(a1, m1, b1, n1);

        int[] a2 = {1};
        int[] b2 = {};
        int m2 = 1, n2 = 0;
        merge2(a2, m2, b2, n2);

        int[] a3 = {0};
        int[] b3 = {1};
        int m3 = 0, n3 = 1;
        merge2(a3, m3, b3, n3);

        int[] a4 = {4,5,6,0,0,0};
        int[] b4 = {1,2,3};
        int m4 = 3, n4 = 3;
        merge2(a4, m4, b4, n4);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) printArray(nums1);
        int item = m + n - 1;

        m = m - 1;
        n = n - 1;

        while (item >= 0) {
            if (m >= 0 && n >= 0) {
                if (nums1[m] > nums2[n]) {
                    nums1[item] = nums1[m--];
                } else {
                    nums1[item] = nums2[n--];
                }
            } else if (m >= 0 ) {
                nums1[item] = nums1[m--];
            } else {
                nums1[item] = nums2[n--];
            }
            item--;
        }
        printArray(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) printArray(nums1);

        int item = m + n - 1;

        m = m - 1;
        n = n - 1;

        while ( n >= 0 ) { // пока не все объекты скопировались
            if (m >= 0 && nums1[m] > nums2[n]) {
                // если истина, то в nums1 пишем большее число.
                nums1[item--] = nums1[m--];
            } else {
                // иначе значение из nums2
                nums1[item--] = nums2[n--];
            }
            // я хз почему это работает?
        }
        printArray(nums1);
    }

    public static void printArray(int[] nums) {
        for (int item : nums) {
            System.out.printf("%d ", item);
        }
        System.out.println("\n");
    }
}
