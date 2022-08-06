package c_home_work.hw01;
//    https://leetcode.com/problems/duplicate-zeros/

import a_lectures.PrintIntArray;

public class EX1089_DuplicateZeros {
    public static void main(String[] args) {
//  Input: arr = [1,0,2,3,0,4,5,0]
//  Output: [1,0,0,2,3,0,0,4]
//  Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
        int[] arr1 = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr1);
        int[] arr2= {1,0,2,3,0,4,5,0};
        duplicateZeros(arr2);
    }
    public static void duplicateZeros(int[] arr) {
        int itemPointer = 0;

        while (itemPointer < arr.length - 1) {
            if (arr[itemPointer] == 0) {
                int zeroPointer = itemPointer + 1;
                // сдвигаем весь массив вправо со следующего элемента
                //  itemPointer + 1
                int i = arr.length - 1;
                while ( i > zeroPointer ) {
                    arr[i] = arr[i - 1];
                    i--;
                }
                arr[zeroPointer++] = 0;
                itemPointer++;
            }
            itemPointer++;
        }
        PrintIntArray.printArray(arr);
    }
}
