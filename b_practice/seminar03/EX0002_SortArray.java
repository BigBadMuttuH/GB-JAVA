package b_practice.seminar03;

import java.util.Arrays;

public class EX0002_SortArray {
    public static void main(String[] args) {
        int[] n = new int[] {5, 4, 3, 2, 1};

        mergeSort(n, 0, n.length -1);
        System.out.println(Arrays.toString(n));

    }
    static void mergeSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);

        merge(nums,start, mid, end);
    }

    static void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int rigth = mid + 1;
        int k = 0;
        while (start <= mid && rigth <= end) {
            if (nums[start] < nums[rigth]) {
                temp[k++] = nums[start++];
            } else {
                temp[k++] = nums[rigth++];
            }
        }
        while (start <= mid) temp[k++] = nums[start++];
        while (rigth <= end) temp[k++] = nums[rigth++];
        for (int i = start; i <= end; i++) {
            nums[i] = temp[i - start];
        }
    }
}
