package c_home_work.hw02;

import java.util.Arrays;

/**
 * сортировка слиянием
 * */
public class EX0006_Merge {
    public static void main(String[] args) {
        int[] test1 = {6, 3, 5, 2, 4, 7, 8, 1, 9};
        System.out.println(Arrays.toString(sortArray(test1)));
    }

    public static int [] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        int[] leftArray = new int[array.length / 2];
        System.arraycopy(array, 0, leftArray, 0, array.length / 2);

        int[] rightArray = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, rightArray, 0, array.length - array.length /2 );

        leftArray = sortArray(leftArray);
        rightArray = sortArray(rightArray);

        return mergeArray(leftArray, rightArray);
    }

    public static int[] mergeArray(int[] leftArray, int[] rightArray) {

        int[] mergeArray = new int[leftArray.length + rightArray.length];
        int positionLeft = 0;
        int positionRight = 0;

        for (int i = 0; i < mergeArray.length; i++) {
            if (positionLeft == leftArray.length) {
                mergeArray[i] = rightArray[i - positionRight];
                positionRight++;
            } else if (positionRight == rightArray.length) {
                mergeArray[i] = leftArray[i - positionLeft];
                positionLeft++;

            } else if (leftArray[i - positionLeft] < rightArray[i - positionRight]) {
                mergeArray[i] = leftArray[i - positionLeft];
                positionRight++;
            } else {
                mergeArray[i] = rightArray[i - positionRight];
                positionLeft++;
            }
        }
        return mergeArray;
    }
}
