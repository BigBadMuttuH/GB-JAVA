package a_lectures.GeekBrains;

public class Arrays {
    public static void main(String[] args) {
        myArray1();
        myArray2();
        myArray3();

    }
    public static void myArray1() {
        int[] arr = new int[10];
        System.out.println(arr.length); // 10

        arr = new int[] {1, 2, 3, 4, 5}; // 5
        System.out.println(arr.length);
    }

    // многомерные массивы
    public static void myArray2() {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }

    // многомерные массивы
    public static void myArray3() {
        int[][] arr = new int[3][5];
        for (int i =0; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length;  j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
