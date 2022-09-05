package e_algoritms.binary_search;

import java.util.Arrays;
import java.util.Random;

public class binary_search {
    public static void main(String[] args) {
        int[] my_array = new int[10];
        Random random = new Random();
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = random.nextInt(10);
        }
        Arrays.sort(my_array);
        System.out.println(Arrays.toString(my_array));
        System.out.println(binarySearch(my_array, 6));
    }

    public static int binarySearch(int[] ar, int item) {
        int low = 0;
        int high = ar.length - 1;
        int mid = 0;
        int guess = 0;

        while (low <= high) {
            mid = (low + high);
            guess = ar[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
